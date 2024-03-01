#!/bin/bash

#set -euxo pipefail  #Discomment for testing

DESCRIPTION="${*:-${DESCRIPTION:-}}"
while [ -z "${DESCRIPTION}" ]; do
    echo 'Enter migration description'
    read -r DESCRIPTION
done

FORMATED_DESCRIPTION=$(echo "$DESCRIPTION" | iconv -t ASCII//TRANSLIT | tr -cd '_[:space:][:alnum:]' | xargs | tr '[:upper:]' '[:lower:]' | tr -s '[:space:]' _)
FORMATED_DESCRIPTION=${FORMATED_DESCRIPTION%_}
VERSION=$(date -u +%Y_%m_%d_%H_%M_%S)
MIGRATIONS_DIR='src/main/resources/db/migration'
SCRIPT_DIR=$(dirname "$0")
NEW_MIGRATION_FILE="$SCRIPT_DIR/$MIGRATIONS_DIR/V${VERSION}__$FORMATED_DESCRIPTION.sql"

echo "-- ${DESCRIPTION}" > "$NEW_MIGRATION_FILE"
echo "Migration file created at '$NEW_MIGRATION_FILE'"
