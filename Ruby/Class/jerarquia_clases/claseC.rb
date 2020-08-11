require_relative 'claseB'
class ClaseC < ClaseB
  def m_1
    super
  end
  def m_2
    2
  end
  def m_3
    self.m_3
  end
end
