db = db.getSiblingDB('alunodb');

db.createUser({
  user: "aluno",
  pwd: "aluno",
  roles: [{ role: "readWrite", db: "alunodb" }]
});

db.createCollection("aluno");

db.aluno.insertMany([
  {
    nome: "Carlos Silva",
    matricula: 2024001,
    dataIngresso: ISODate("2023-02-15T00:00:00Z"),
    dataNascimento: ISODate("2000-10-10T00:00:00Z"),
    email: "carlos.silva@email.com",
    telefone: "11999999999"
  },
  {
    nome: "Hannah Perez",
    matricula: 2024002,
    dataIngresso: ISODate("2023-03-10T00:00:00Z"),
    dataNascimento: ISODate("1999-07-20T00:00:00Z"),
    email: "hannah.perez@example.com",
    telefone: "+1-555-357-9516"
  },
  {
      "nome": "Julie Evans",
      "matricula": 2024893,
      "dataIngresso": ISODate("2024-09-26T00:00:00Z"),
      "dataNascimento": ISODate("1987-05-09T00:00:00Z"),
      "email": "wallacepeter@duncan-saunders.org",
      "telefone": "001-070-368-4592x564"
    },
    {
      "nome": "Tiffany Stanley",
      "matricula": 2024944,
      "dataIngresso": ISODate("2023-04-02T00:00:00Z"),
      "dataNascimento": ISODate("1985-08-24T00:00:00Z"),
      "email": "xsims@hotmail.com",
      "telefone": "(926)775-3098x63440"
    },
    {
      "nome": "Dominique Bell PhD",
      "matricula": 2024960,
      "dataIngresso": ISODate("2023-12-30T00:00:00Z"),
      "dataNascimento": ISODate("1992-07-04T00:00:00Z"),
      "email": "liujoshua@jordan.com",
      "telefone": "+1-785-504-8674"
    },
    {
      "nome": "Brian Johnson",
      "matricula": 2024532,
      "dataIngresso": ISODate("2022-08-25T00:00:00Z"),
      "dataNascimento": ISODate("1986-11-20T00:00:00Z"),
      "email": "morganemma@mitchell-reynolds.org",
      "telefone": "001-974-714-5753"
    },
    {
      "nome": "Ronald Charles",
      "matricula": 2024705,
      "dataIngresso": ISODate("2024-03-11T00:00:00Z"),
      "dataNascimento": ISODate("1991-09-14T00:00:00Z"),
      "email": "mendezdavid@hotmail.com",
      "telefone": "(431)573-6393"
    },
    {
      "nome": "Stacy Watson",
      "matricula": 2024808,
      "dataIngresso": ISODate("2023-05-11T00:00:00Z"),
      "dataNascimento": ISODate("1991-02-08T00:00:00Z"),
      "email": "stevenlopez@yahoo.com",
      "telefone": "875.767.2043x096"
    },
    {
      "nome": "Thomas Miller",
      "matricula": 2024616,
      "dataIngresso": ISODate("2024-10-27T00:00:00Z"),
      "dataNascimento": ISODate("1989-06-17T00:00:00Z"),
      "email": "john77@patel.net",
      "telefone": "662.963.9144x81761"
    },
    {
      "nome": "Barry Anderson",
      "matricula": 2024439,
      "dataIngresso": ISODate("2022-01-09T00:00:00Z"),
      "dataNascimento": ISODate("1988-04-22T00:00:00Z"),
      "email": "clarkjeff@gmail.com",
      "telefone": "681.957.4271"
    },
    {
      "nome": "Mr. Brett Hernandez",
      "matricula": 2024769,
      "dataIngresso": ISODate("2022-07-27T00:00:00Z"),
      "dataNascimento": ISODate("1987-07-14T00:00:00Z"),
      "email": "jennifer15@gmail.com",
      "telefone": "199.551.1694x95196"
    },
    {
      "nome": "Brett Robinson",
      "matricula": 2024673,
      "dataIngresso": ISODate("2023-02-12T00:00:00Z"),
      "dataNascimento": ISODate("1982-06-22T00:00:00Z"),
      "email": "melissa77@gmail.com",
      "telefone": "(076)373-1478x13800"
    },
    {
      "nome": "James Stewart",
      "matricula": 2024155,
      "dataIngresso": ISODate("2023-06-08T00:00:00Z"),
      "dataNascimento": ISODate("2004-07-27T00:00:00Z"),
      "email": "millertheresa@yahoo.com",
      "telefone": "2118751553"
    },
    {
      "nome": "Francisco Johnson",
      "matricula": 2024332,
      "dataIngresso": ISODate("2024-10-03T00:00:00Z"),
      "dataNascimento": ISODate("1989-08-05T00:00:00Z"),
      "email": "cunninghamkimberly@zuniga.com",
      "telefone": "001-155-844-1710x5928"
    },
    {
      "nome": "Mr. Glenn Garcia",
      "matricula": 2024749,
      "dataIngresso": ISODate("2023-10-16T00:00:00Z"),
      "dataNascimento": ISODate("1989-06-09T00:00:00Z"),
      "email": "raymond19@davis.net",
      "telefone": "345.733.6283"
    }
]);