class Aprendiz
    attr_accessor :id, :email, :dis, :edad
  
    def initialize(id, email)
      @id = id
      @email = email
    end
  end
  
  aprendiz1 = Aprendiz.new(876543, "daniel15@gmail.com")
  aprendiz1.dis = 0
  aprendiz1.edad = 25
  
  puts aprendiz1.id
  puts aprendiz1.email
  puts aprendiz1.dis
  puts aprendiz1.edad
  
  aprendiz2 = Aprendiz.new(7856, "cristian01@gmail.com")
  aprendiz2.dis = 1
  aprendiz2.edad = 20
  
  puts aprendiz2.id
  puts aprendiz2.email
  puts aprendiz2.dis
  puts aprendiz2.edad
  
  aprendiz3 = Aprendiz.new(111, "leiner43@gmail.com")
  aprendiz3.dis = 1
  aprendiz3.edad = 19
  
  puts aprendiz3.id
  puts aprendiz3.email
  puts aprendiz3.dis
  puts aprendiz3.edad
  
  aprendiz4 = Aprendiz.new(9879, "12stiven@gmail.com")
  aprendiz4.dis = 1
  aprendiz4.edad = 17
  
  puts aprendiz4.id
  puts aprendiz4.email
  puts aprendiz4.dis
  puts aprendiz4.edad
  
  aprendiz5 = Aprendiz.new(2314, "Maria55@gmail.com")
  aprendiz5.dis = 0
  aprendiz5.edad = 20
  
  puts aprendiz5.id
  puts aprendiz5.email
  puts aprendiz5.dis