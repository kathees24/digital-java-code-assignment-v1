Book Services Curl
------------------

Get All books
curl -X GET -i 'http://127.0.0.1:8080/bookstore/book'

Get Single Book
curl -X GET -i 'http://127.0.0.1:8080/bookstore/book/1'

Create Book
curl -X POST -H 'Content-Type: application/json' -i 'http://127.0.0.1:8080/bookstore/book' --data '{"id":3,"name":"C++","author":"E Balagrusamy","price":100.0}'

Update Book 
curl -X PUT -H 'Content-Type: application/json' -i 'http://127.0.0.1:8080/bookstore/book/3' --data '{"id":3,"name":"C++","author":"E Balagrusamy","price":120.0}'

Delete Single Book
curl -X DELETE -H 'Content-Type: application/json' -i 'http://127.0.0.1:8080/bookstore/book/5'

Delete All Book
curl -X DELETE -H 'Content-Type: application/json' -i 'http://127.0.0.1:8080/bookstore/book/3' --data '{"id":4,"name":"Angular JS","author":"E Balagrusamy","price":120.0}'