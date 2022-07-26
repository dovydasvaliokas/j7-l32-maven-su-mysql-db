-- Knyga lentelė
CREATE TABLE IF NOT EXISTS knyga (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    pavadinimas VARCHAR(50) NOT NULL,
    aprasymas VARCHAR(300),
    kaina DECIMAL(5,2) UNSIGNED NOT NULL,
    puslapiu_skaicius INT UNSIGNED NOT NULL,
    PRIMARY KEY(id)
)ENGINE=INNODB;


-- klientai lentelė
CREATE TABLE IF NOT EXISTS klientai (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    vardas VARCHAR(50) NOT NULL,
    pavarde VARCHAR(50) NOT NULL,
    login VARCHAR(30) NOT NULL,
    slaptazodis VARCHAR(30) NOT NULL,
    PRIMARY KEY(id)
) ENGINE = INNODB;
    

-- autoriai
CREATE TABLE IF NOT EXISTS autoriai (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    vardas VARCHAR(50) NOT NULL,
    pavarde VARCHAR(50) NOT NULL,
    šalis VARCHAR(50),
    PRIMARY KEY(id)
) ENGINE = INNODB;



-- sujungimo lentelė
CREATE TABLE IF NOT EXISTS knygu_autoriai(
    autoriaus_id INT UNSIGNED NOT NULL,
    knygos_id INT UNSIGNED NOT NULL,
    PRIMARY KEY(autoriaus_id, knygos_id),
    FOREIGN KEY(autoriaus_id) REFERENCES autoriai(id),
    FOREIGN KEY(knygos_id) REFERENCES knyga(id)
) ENGINE = INNODB;