
package com.journaldev.bootifulmongo.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
