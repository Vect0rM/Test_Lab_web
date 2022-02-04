-- Table: users
CREATE TABLE Users(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
)
ENGINE = InnoDB;

CREATE TABLE Roles(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
)
ENGINE = InnoDB;

CREATE TABLE user_roles(
    user_id INT NOT NULL,
    role_id INT NOT NULL,

    FOREIGN KEY (user_id) REFERENCES Users (id),
    FOREIGN KEY (role_id) REFERENCES Roles (id),

    UNIQUE (user_id, role_id)
)
ENGINE = InnoDB;

INSERT INTO Users VALUE (1, 'u', '1');
INSERT INTO Users VALUE (2, 'A', '2');

INSERT INTO Roles VALUE (1, 'Role_User');
INSERT INTO Roles VALUE (2, 'Role_ADMIN');

INSERT INTO user_roles VALUE (2, 2);