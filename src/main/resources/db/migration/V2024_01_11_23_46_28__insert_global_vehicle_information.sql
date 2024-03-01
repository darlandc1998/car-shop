-- insert_global_vehicle_information
insert into categories (name)
values
  ('Hatch'),
  ('Sedã'),
  ('SUV'),
  ('Picapes'),
  ('Crossover'),
  ('Perua'),
  ('Minivan'),
  ('Esportivo'),
  ('Furgão'),
  ('Caminhão'),
  ('Moto');

insert into colors(name)
values
  ('Amarelo'),
  ('Azul'),
  ('Bege'),
  ('Bordo'),
  ('Branco'),
  ('Champanhe'),
  ('Cinza'),
  ('Dourado'),
  ('Grafite'),
  ('Laranja'),
  ('Marrom'),
  ('Pérola'),
  ('Prata'),
  ('Preto'),
  ('Roxo'),
  ('Verde'),
  ('Vermelho'),
  ('Vinho'),
  ('Violeta');

insert into engine_types(name, identifier)
values
  ('Automático', 'AUTOMATIC'),
  ('Manual', 'MANUAL');

insert into fuels(name, identifier)
values
  ('Alcool', 'ALCOHOL'),
  ('Diesel', 'DIESEL'),
  ('Elétrico', 'ELETRIC'),
  ('Flex', 'FLEX'),
  ('Gasolina', 'GASOLINE'),
  ('GNV', 'GNV'),
  ('GNV Flex', 'GNV_FLEX'),
  ('GNV Gasolina', 'GNV_GASOLINE');

insert into equipments(name)
values
  ('2P'),
  ('4P'),
  ('4x2'),
  ('4x4'),
  ('7 lugares'),
  ('Abertura elétrica do porta malas'),
  ('ABS'),
  ('Acendedor de cigarro'),
  ('Aerofólio'),
  ('Air bag'),
  ('Air bag (4)'),
  ('Air bag cortina'),
  ('Air bag duplo'),
  ('Air bag lateral'),
  ('Air bag lateral dianteiro'),
  ('Air bag lateral traseiro'),
  ('Alarme'),
  ('Alarme com acionamento dos vidros'),
  ('Aparelho de DVD'),
  ('Aquecimento dos bancos'),
  ('Ar condicionado'),
  ('Ar condicinado digital'),
  ('Ar quente'),
  ('Automático'),
  ('Bagageiro'),
  ('Banco bi-partido'),
  ('Banco elétrico'),
  ('Bancos de couro'),
  ('Bancos recaro'),
  ('Bancos simples'),
  ('Break light'),
  ('Calotas'),
  ('Câmbio borboleta'),
  ('Câmbio manual'),
  ('Canaletas'),
  ('Capota'),
  ('Capota de fibra'),
  ('CD player'),
  ('Central multimídia'),
  ('Chave cópia'),
  ('Chave presencial'),
  ('Cibie'),
  ('Cinto 4 pontos'),
  ('Code'),
  ('Computador de bordo'),
  ('Confort line'),
  ('Console central'),
  ('Controle de som no volante'),
  ('Controle de tração'),
  ('Controle interno do espelho'),
  ('Conversível'),
  ('Desembaçador traseiro'),
  ('Direção elétrica'),
  ('Direção hidraulica'),
  ('DVD'),
  ('Encosto cab. traseira'),
  ('Engate'),
  ('Espelho cortesia para passageiro'),
  ('Espelho cortesia para passageiro e motorista'),
  ('Espelho personalizado'),
  ('Estribo'),
  ('Farol de milha'),
  ('Farol de neblina'),
  ('Faroletes'),
  ('Freio a ar'),
  ('Freio a disco'),
  ('Frigobar'),
  ('Friso lateral'),
  ('Hidraulico'),
  ('Insulfilme'),
  ('Interface'),
  ('Janela basculante'),
  ('Limpador traseiro'),
  ('Magazine'),
  ('Manual'),
  ('Mata cachorro'),
  ('Mecânico'),
  ('MP3 player'),
  ('Nota fiscal'),
  ('Outros'),
  ('Painel digital'),
  ('Partida elétrica'),
  ('Película'),
  ('Piloto automático'),
  ('Pintura metálica'),
  ('Porta copos'),
  ('Porta malas automático'),
  ('Protetor de caçamba'),
  ('Protetor de cárter'),
  ('Quebra mato'),
  ('Regulagem de altura do banco'),
  ('Regulagem elétrica dos faróis'),
  ('Relógio digital'),
  ('Retrovisor elétrico'),
  ('Rodas de liga leve'),
  ('Santo Antônio'),
  ('Semi-automático'),
  ('Sensor crepuscular'),
  ('Sensor de chuva'),
  ('Sensor de estacionamento'),
  ('Sensor de iluminação'),
  ('Start/stop in go'),
  ('Suspensão a ar'),
  ('Suspensão ativa'),
  ('Suspensão automática'),
  ('Teto solar'),
  ('Tip-tronic'),
  ('Toca fitas'),
  ('Trava elétrica'),
  ('Trava multi-lock'),
  ('Trio elétrico'),
  ('Turbo'),
  ('Vidro elétrico nas 4P'),
  ('Vidros elericos'),
  ('Volante escamoteavel');

insert into brands(name)
values
  ('Seat'),
  ('Renault'),
  ('Peugeot'),
  ('Dacia'),
  ('Citroën'),
  ('Opel'),
  ('Alfa Romeo'),
  ('Škoda'),
  ('Chevrolet'),
  ('Porsche'),
  ('Honda'),
  ('Subaru'),
  ('Mazda'),
  ('Mitsubishi'),
  ('Lexus'),
  ('Toyota'),
  ('BMW'),
  ('Volkswagen'),
  ('Suzuki'),
  ('Mercedes-Benz'),
  ('Saab'),
  ('Audi'),
  ('Kia'),
  ('Land Rover'),
  ('Dodge'),
  ('Chrysler'),
  ('Ford'),
  ('Hummer'),
  ('Hyundai'),
  ('Infiniti'),
  ('Jaguar'),
  ('Jeep'),
  ('Nissan'),
  ('Volvo'),
  ('Daewoo'),
  ('Fiat'),
  ('MINI'),
  ('Rover'),
  ('Smart');

INSERT INTO models(NAME, id_brand) VALUES
            ( 'Alhambra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Altea',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Altea XL',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Arosa',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Cordoba',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Cordoba Vario',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Exeo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Ibiza',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Ibiza ST',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Exeo ST',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Leon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Leon ST',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Inca',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Mii',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Toledo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Seat') ),
            ( 'Captur',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Clio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Clio Grandtour',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Espace',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Express',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Fluence',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Grand Espace',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Grand Modus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Grand Scenic',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Kadjar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Kangoo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Kangoo Express',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Koleos',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Laguna',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Laguna Grandtour',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Latitude',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mascott',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mégane',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mégane CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mégane Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mégane Grandtour',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mégane Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Mégane Scénic',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Scénic',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Talisman',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Talisman Grandtour',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Thalia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Twingo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Wind',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( 'Zoé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Renault') ),
            ( '1007',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '107',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '106',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '108',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '2008',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '205',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '205 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '206',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '206 CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '206 SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '207',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '207 CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '207 SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '306',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '307',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '307 CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '307 SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '308',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '308 CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '308 SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '309',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '4007',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '4008',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '405',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '406',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '407',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '407 SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '5008',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '508',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '508 SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '605',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '806',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '607',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( '807',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( 'Bipper',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( 'RCZ',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Peugeot') ),
            ( 'Dokker',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Duster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Lodgy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Logan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Logan MCV',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Logan Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Sandero',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Solenza',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dacia') ),
            ( 'Berlingo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C-Crosser',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C-Elissée',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C-Zero',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C1',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C2',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C3 Picasso',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C4 Aircross',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C4 Cactus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C4 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C4 Grand Picasso',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C4 Sedan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C5 Break',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C5 Tourer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'C8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'DS3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'DS4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'DS5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Evasion',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Jumper',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Jumpy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Saxo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Nemo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Xantia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Xsara',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Citroën') ),
            ( 'Agila',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Ampera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Antara',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Astra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Astra cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Astra caravan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Astra coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Calibra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Campo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Cascada',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Corsa',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Frontera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Insignia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Insignia kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Kadett',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Meriva',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Mokka',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Movano',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Omega',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Signum',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Vectra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Vectra Caravan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Vivaro',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Vivaro Kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( 'Zafira',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Opel') ),
            ( '145',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '146',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '147',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '155',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '156',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '156 Sportwagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '159',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '159 Sportwagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '164',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '166',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( '4C',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'Brera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'GTV',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'MiTo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'Crosswagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'Spider',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'GT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'Giulietta',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'Giulia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Alfa Romeo') ),
            ( 'Favorit',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Felicia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Citigo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Fabia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Fabia Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Fabia Sedan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Felicia Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Octavia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Octavia Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Roomster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Yeti',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Rapid',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Rapid Spaceback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Superb',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Superb Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Škoda') ),
            ( 'Alero',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Aveo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Camaro',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Captiva',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Corvette',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Cruze',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Cruze SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Epica',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Equinox',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Evanda',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'HHR',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Kalos',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Lacetti',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Lacetti SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Lumina',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Malibu',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Matiz',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Monte Carlo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Nubira',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Orlando',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Spark',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Suburban',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Tacuma',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Tahoe',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( 'Trax',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chevrolet') ),
            ( '911 Carrera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( '911 Carrera Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( '911 Targa',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( '911 Turbo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( '924',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( '944',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( '997',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( 'Boxster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( 'Cayenne',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( 'Cayman',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( 'Macan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( 'Panamera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Porsche') ),
            ( 'Accord',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Accord Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Accord Tourer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'City',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Civic',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Civic Aerodeck',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Civic Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Civic Tourer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Civic Type R',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'CR-V',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'CR-X',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'CR-Z',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'FR-V',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'HR-V',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Insight',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Integra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Jazz',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Legend',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'Prelude',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Honda') ),
            ( 'BRZ',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Forester',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Impreza',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Impreza Wagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Justy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Legacy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Legacy Wagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Legacy Outback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Levorg',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Outback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'SVX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Tribeca',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'Tribeca B9',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( 'XV',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Subaru') ),
            ( '121',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '2',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '323',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '323 Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '323 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '323 F',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '6 Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '626',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '626 Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'B-Fighter',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'B2500',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'BT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'CX-3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'CX-5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'CX-7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'CX-9',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'Demio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'MPV',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'MX-3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'MX-5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'MX-6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'Premacy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'RX-7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'RX-8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( 'Xedox 6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mazda') ),
            ( '3000 GT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'ASX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Carisma',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Colt',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Colt CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Eclipse',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Fuso canter',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Galant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Galant Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Grandis',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'L200',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'L200 Pick up',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'L200 Pick up Allrad',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'L300',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Lancer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Lancer Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Lancer Evo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Lancer Sportback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Outlander',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Pajero',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Pajeto Pinin',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Pajero Pinin Wagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Pajero Sport',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Pajero Wagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'Space Star',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mitsubishi') ),
            ( 'CT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'GS',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'GS 300',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'GX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'IS',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'IS 200',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'IS 250 C',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'IS-F',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'LS',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'LX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'NX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'RC F',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'RX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'RX 300',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'RX 400h',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'RX 450h',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( 'SC 430',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Lexus') ),
            ( '4-Runner',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Auris',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Avensis',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Avensis Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Avensis Van Verso',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Aygo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Camry',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Carina',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Celica',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Corolla',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Corolla Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Corolla sedan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Corolla Verso',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'FJ Cruiser',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'GT86',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Hiace',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Hiace Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Highlander',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Hilux',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Land Cruiser',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'MR2',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Paseo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Picnic',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Prius',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'RAV4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Sequoia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Starlet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Supra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Tundra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Urban Cruiser',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Verso',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Yaris',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'Yaris Verso',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Toyota') ),
            ( 'i3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'i8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'M3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'M4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'M5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'M6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 1',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 1 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 1 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 2',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 2 Active Tourer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 2 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 2 Gran Tourer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 3 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 3 Compact',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 3 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 3 GT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 3 Touring',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 4 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 4 Gran Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 5 GT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 5 Touring',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 6 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 6 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 6 Gran Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Rad 8 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'X1',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'X3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'X4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'X5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'X6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Z3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Z3 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Z3 Roadster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Z4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Z4 Roadster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'BMW') ),
            ( 'Amarok',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Beetle',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Bora',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Bora Variant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Caddy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Caddy Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Life',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'California',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Caravelle',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Crafter',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Crafter Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Crafter Kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'CrossTouran',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Eos',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Fox',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Golf',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Golf Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Golf Plus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Golf Sportvan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Golf Variant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Jetta',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'LT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Lupo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Multivan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'New Beetle',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'New Beetle Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Passat',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Passat Alltrack',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Passat CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Passat Variant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Passat Variant Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Phaeton',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Polo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Polo Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Polo Variant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Scirocco',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Sharan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T4 Caravelle',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T4 Multivan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T5 Caravelle',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T5 Multivan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'T5 Transporter Shuttle',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Tiguan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Touareg',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Touran',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volkswagen') ),
            ( 'Alto',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Baleno',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Baleno kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Grand Vitara',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Grand Vitara XL-7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Ignis',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Jimny',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Kizashi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Liana',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Samurai',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Splash',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Swift',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'SX4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'SX4 Sedan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Vitara',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( 'Wagon R+',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Suzuki') ),
            ( '100 D',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '115',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '124',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '126',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '190',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '190 D',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '190 E',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '200 - 300',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '200 D',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '200 E',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '210 Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '210 kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '310 Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '310 kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '230 - 300 CE Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '260 - 560 SE',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '260 - 560 SEL',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '500 - 600 SEC Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda A',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'A',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'A L',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'AMG GT',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda B',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda C',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'C',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'C Sportcoupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'C T',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Citan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CL',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CL',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CLA',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CLC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CLK Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CLK Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'CLS',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda E',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'E',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'E Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'E Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'E T',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda G',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'G Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'GL',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'GLA',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'GLC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'GLE',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'GLK',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda M',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'MB 100',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda R',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Trieda S',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'S',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'S Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'SL',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'SLC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'SLK',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'SLR',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( 'Sprinter',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Mercedes-Benz') ),
            ( '9-3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '9-3 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '9-3 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '9-3 SportCombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '9-5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '9-5 SportCombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '900',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '900 C',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '900 C Turbo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '9000',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Saab') ),
            ( '100',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( '100 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( '80',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( '80 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( '80 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( '90',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A1',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A2',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A3 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A3 Limuzina',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A3 Sportback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A4',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A4 Allroad',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A4 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A4 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A5 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A5 Sportback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A6 Allroad',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A6 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'A8 Long',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'Q3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'Q5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'Q7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'R8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'RS4 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'RS4/RS4 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'RS5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'RS6 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'RS7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S3/S3 Sportback',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S4 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S4/S4 Avant',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S5/S5 Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S6/RS6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S7',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'S8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'SQ5',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'TT Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'TT Roadster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'TTS',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Audi') ),
            ( 'Avella',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Besta',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Carens',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Carnival',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Cee`d',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Cee`d SW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Cerato',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'K 2500',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Magentis',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Opirus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Optima',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Picanto',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Pregio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Pride',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Pro Cee`d',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Rio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Rio Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Rio sedan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Sephia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Shuma',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Sorento',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Soul',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Sportage',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( 'Venga',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Kia') ),
            ( '109',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Defender',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Discovery',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Discovery Sport',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Freelander',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Range Rover',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Range Rover Evoque',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Range Rover Sport',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Land Rover') ),
            ( 'Avenger',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Caliber',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Challenger',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Charger',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Grand Caravan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Journey',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Magnum',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Nitro',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'RAM',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Stealth',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( 'Viper',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Dodge') ),
            ( '300 C',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( '300 C Touring',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( '300 M',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Crossfire',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Grand Voyager',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'LHS',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Neon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Pacifica',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Plymouth',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'PT Cruiser',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Sebring',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Sebring Convertible',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Stratus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Stratus Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Town & Country',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Voyager',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Chrysler') ),
            ( 'Aerostar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'B-Max',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'C-Max',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Cortina',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Cougar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Edge',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Escort',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Escort Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Escort kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Explorer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'F-150',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'F-250',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Fiesta',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Focus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Focus C-Max',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Focus CC',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Focus kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Fusion',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Galaxy',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Grand C-Max',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Ka',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Kuga',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Maverick',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Mondeo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Mondeo Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Mustang',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Orion',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Puma',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Ranger',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'S-Max',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Sierra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Street Ka',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Tourneo Connect',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Tourneo Custom',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Bus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Connect LWB',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Courier',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Custom',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Tourneo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Valnik',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Transit Van 350',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'Windstar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Ford') ),
            ( 'H2',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hummer') ),
            ( 'H3',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hummer') ),
            ( 'Accent',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Atos',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Atos Prime',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Elantra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Galloper',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Genesis',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Getz',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Grandeur',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'H 350',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'H1',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'H1 Bus',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'H1 Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'H200',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'i10',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'i20',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'i30',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'i30 CW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'i40',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'i40 CW',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'ix20',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'ix35',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'ix55',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Lantra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Matrix',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Santa Fe',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Sonata',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Terracan',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Trajet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Tucson',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'Veloster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Hyundai') ),
            ( 'EX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'FX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'G',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'G Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'M',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'Q',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'QX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Infiniti') ),
            ( 'Daimler',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'F-Pace',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'F-Type',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'S-Type',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'Sovereign',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'X-Type',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'X-type Estate',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XE',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XF',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XJ',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XJ12',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XJ6',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XJ8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XJ8',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XJR',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XK',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XK8 Convertible',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XKR',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'XKR Convertible',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jaguar') ),
            ( 'Cherokee',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( 'Commander',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( 'Compass',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( 'Grand Cherokee',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( 'Patriot',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( 'Renegade',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( 'Wrangler',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Jeep') ),
            ( '100 NX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( '200 SX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( '350 Z',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( '350 Z Roadster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( '370 Z',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Almera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Almera Tino',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Cabstar E - T',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Cabstar TL2 Valnik',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'e-NV200',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'GT-R',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Insterstar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Juke',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'King Cab',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Leaf',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Maxima',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Maxima QX',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Micra',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Murano',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Navara',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Note',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'NP300 Pickup',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'NV200',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'NV400',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Pathfinder',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Patrol',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Patrol GR',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Pickup',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Pixo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Primastar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Primastar Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Primera',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Primera Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Pulsar',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Qashqai',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Serena',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Sunny',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Terrano',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Tiida',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Trade',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'Vanette Cargo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( 'X-Trail',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Nissan') ),
            ( '240',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( '340',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( '360',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( '460',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( '850',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( '850 kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'C30',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'C70',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'C70 Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'C70 Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'S40',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'S60',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'S70',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'S80',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'S90',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'V40',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'V50',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'V60',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'V70',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'V90',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'XC60',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'XC70',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'XC90',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Volvo') ),
            ( 'Espero',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Kalos',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Lacetti',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Lanos',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Leganza',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Lublin',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Matiz',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Nexia',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Nubira',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Nubira kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Racer',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Tacuma',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( 'Tico',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Daewoo') ),
            ( '1100',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( '126',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( '500',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( '500L',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( '500X',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( '850',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Barchetta',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Brava',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Cinquecento',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Croma',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Doblo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Doblo Cargo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Doblo Cargo Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Ducato',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Ducato Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Ducato Kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Ducato Podvozok',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Florino',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Florino Combi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Freemont',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Grande Punto',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Idea',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Linea',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Marea',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Marea Weekend',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Multipla',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Palio Weekend',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Panda',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Panda Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Punto',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Punto Cabriolet',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Punto Evo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Punto Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Qubo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Scudo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Scudo Van',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Scudo Kombi',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Sedici',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Seicento',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Stilo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Stilo Multiwagon',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Strada',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Talento',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Tipo',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Ulysse',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Uno',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'X1/9',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Fiat') ),
            ( 'Cooper',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper Clubman',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper D',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper D Clubman',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper S',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper S Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Cooper S Clubman',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Countryman',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'Mini One',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( 'One D',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'MINI') ),
            ( '200',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '214',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '218',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '25',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '400',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '414',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '416',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '620',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( '75',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Rover') ),
            ( 'Cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') ),
            ( 'City-Coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') ),
            ( 'Compact Pulse',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') ),
            ( 'Forfour',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') ),
            ( 'Fortwo cabrio',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') ),
            ( 'Fortwo coupé',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') ),
            ( 'Roadster',
              (SELECT id
               FROM   brands
               WHERE  NAME = 'Smart') );