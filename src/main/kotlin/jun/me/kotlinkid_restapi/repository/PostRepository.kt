package jun.me.kotlinkid_restapi.repository

import jun.me.kotlinkid_restapi.domain.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long?>{
}