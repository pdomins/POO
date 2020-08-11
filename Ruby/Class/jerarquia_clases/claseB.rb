require_relative 'claseA'
class ClaseB < ClaseA
  def m_1
    1
  end

  def m_2
    super.m_2
  end
  def m_3
    super
  end
end
