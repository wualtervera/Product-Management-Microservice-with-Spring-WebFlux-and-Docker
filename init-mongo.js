db = db.getSiblingDB('inventory');
db.createUser({
user: "admin",
pwd: "mongo123",
roles: [
  { role: "readWrite", db: "inventory" },
  { role: "dbAdmin", db: "inventory" }
]})