package com.springboot.react.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.react.model.Board;



//백엔드와 데이터베이스를 연결해줌
@Repository //저장소 데베와 연결되는 파일이라는 걸 알려주는 것
public interface BoardRepository extends CrudRepository<Board, Integer>{
	
	Board findTopByOrderByBoardBnoDesc();
	
//	List<GameRecordParticipantEntity> findTop2ByAccountIdOrderByCreatedDesc(Long accountId);
	
	Board save(Board board);
	
	void delete(Board board);

}
