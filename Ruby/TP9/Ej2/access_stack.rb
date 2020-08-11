class AccessStack < Stack
  def initialize
    super
    @push=0
  end

  def push(other)
    super
    @push +=1
  end
  def push_accesses
    @push
  end
  def pop_accesses
    @push - self.length
  end
end