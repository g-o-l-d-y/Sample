package backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer>{
	
}
