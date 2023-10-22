CREATE TABLE test
(
    id int primary key auto_increment,
    naziv varchar(50),
    opis varchar(255)
);

INSERT INTO test(naziv,opis) VALUES ( 'Iva', 'ne radi joj punjac' );


CREATE TABLE pretraga_letova
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    polazni_aerodrom VARCHAR(3),
    dolazni_aerodrom VARCHAR(3),
    datum_polaska DATE,
    datum_povratka DATE,
    broj_putnika INT,

    korisnik_kreirao VARCHAR(50),
    datum_kreiranja DATE,
    korisnik_azuriranja VARCHAR(50),
    datum_azuriranja DATE

);

CREATE TABLE rezultati_letova(
    id INT PRIMARY KEY AUTO_INCREMENT,
    cijena VARCHAR(20),
    odlazna_aviokompanija VARCHAR(10),
    povratna_aviokompanija VARCHAR(10),

    korisnik_kreirao VARCHAR(50),
    datum_kreiranja DATE,
    korisnik_azuriranja VARCHAR(50),
    datum_azuriranja DATE,
    pretraga_id INT
);

ALTER TABLE rezultati_letova ADD FOREIGN KEY (pretraga_id) REFERENCES pretraga_letova(id);