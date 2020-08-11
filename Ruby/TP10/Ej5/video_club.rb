require_relative 'client'
require_relative 'movie_category'
class VideoClub
  def initialize
    @movies = Hash.new
    @clients = Hash.new
  end
  def add_movie(title, category)
    @movies[title] = category unless @movies.has_key?(title)
  end
  def add_customer(name)
    @clients[name] = Client.new(name) unless @clients.has_key?(name)
  end
  def rent(movie_title, client_name, days)
    raise "Customer #{client_name} not found" unless @clients.has_key?(client_name)
    @movies[movie_title].genre == 'Recent'?
        @clients[client_name].points+=1*days :@clients[client_name].points+=1
    @clients[client_name].charge += @movies[movie_title].get_price(days)
  end
  def resume(client_name)
    raise "Customer #{client_name} not found" unless @clients.has_key?(client_name)
    "Resume points: #{@clients[client_name].points}, charge: #{@clients[client_name].charge}"
  end
end
