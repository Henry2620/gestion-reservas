CREATE TABLE reservacion (
id SERIAL PRIMARY KEY,
nombre_paciente VARCHAR(100) NOT NULL,
fecha_consulta DATE NOT NULL,
hora_consulta TIME NOT NULL,
nombre_medico VARCHAR(100) NOT NULL
);

