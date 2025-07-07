package in.ashokit.request;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer>{
	
	@Query(value="SELECT MAX(id) FROM Passenger_data;" , nativeQuery = true)
	public int SelectMaxID();
	
	@Query(value="SELECT cost FROM Passenger_data WHERE Id = :id ;" , nativeQuery = true)
	public String SelectCost(@Param("id") int id);

	public Passenger findById(int id);
	
}
