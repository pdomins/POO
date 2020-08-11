class ComplexNumber
  def initialize(real, imag)
    @real = real
    @imaginary = imag
  end
  def real
    @real
  end
  def imaginary
    @imaginary
  end
  def +(aux)
    ComplexNumber.new(@real+aux.real,@imaginary+aux.imaginary)
  end
end
