require_relative 'company'

class Employee
  def initialize(employee_name, company)
    @employee_name = employee_name
    @company = company
  end
  def employee_name
    @employee_name
  end
  def company
    @company
  end
  def ==(other)
    other.is_a?(Employee) && @employee_name==other.employee_name
  end
  def to_s
    @employee_name
  end

  def inspect
    to_s
  end
end
