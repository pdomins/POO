class B < A
  def m_1
    8
  end
  def m_2
    super.m_1
  end
  def m_4
    20
  end
  def m_5
    m_3
  end
  def m_7
    super.m_4
  end
end
