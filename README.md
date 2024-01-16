### Project requierments
- CRUD for plane:
  - API urls
    - READ - GET
      - /cars - read all cars
      - list/200
      - /cars/{id}
      - one item/200
      - 404 - not found
    - Create - POST
      - /cars 
      - 201/void/created item/header location
      - Udate  PUT - replace 
          - /cars/{id}
          - 200/content
          - 404/not found
    - Patch - partial update
        - /cars/{id}
        - 200/content
        - 404/not found
    - Delete - DELETE 
      - /cars/{id}
      - 200/content
      - 204/no-content
      - 404 - not found
  
pojedyńczy samolot
- opis
- vin
- ilosc miejsc
- predkosc
- zdjecia
- zasieg
- model
- silnik
- pojemnosc bagaznika
- spalanie
               

Lot 
 - samolot konkretny
 - pilot
 - daty startu odlotu
 - miejsce startu odlotu
 
Rezerwaca
- lot   
- klient
- kalendarz
