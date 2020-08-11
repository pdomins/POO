class Stack
  def initialize
    @array = Array.new
  end
  def length
    @array.length
  end
  def push(other)
    @array.push(other)
  end
  def pop
    raise 'Stack is empty' if self.empty?
    @array.pop
  end
  def peek
    raise 'Stack is empty' if self.empty?
    @array[-1]
  end
  def empty?
    @array.empty?
  end
end
