mongo -u mongo -p mongo789 --authenticationDatabase admin localhost/car-shop --eval 'db.createUser({ user: "mongo", pwd: "password", roles: [ { role: "readWrite", db: "car-shop" }, { role: "dbAdmin", db: "car-shop" } ] });'