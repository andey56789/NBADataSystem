package net.nba.controller;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.nba.model.Player;
import net.nba.model.PlayerInfoDetail;
import net.nba.service.PlayerService;
import net.nba.util.FilePathManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunfan314
 *
 */
@Controller
public class PlayerController {
	@Resource
	private PlayerService playerService;
	
	/**
	 * @param teamId
	 * @return	某只球队的球员列表
	 */
	@RequestMapping("/getTeamPlayerList")
	public @ResponseBody List<Player> getTeamPlayerList(int teamId){
		return playerService.getTeamPlayerList(teamId);
	}
	
	/**
	 * @param playerId
	 * @return	某位球员的详细信息
	 */
	@RequestMapping("/getPlayerInfoDetail")
	public @ResponseBody PlayerInfoDetail getPlayerInfoDetail(int playerId){
		return playerService.getPlayerInfoDetail(playerId);
	}
	

//	@RequestMapping("/getPlayerRanks")
//	public @ResponseBody List<Map<String,Object>> getPlayerRanks(@RequestParam(required=false)Date date){
//		//获取球员数据统计排行(得分、篮板、助攻、抢断)，每项排行选取前五名，传入日期参数时显示当日的排行，否则显示赛季排行
//		if(date!=null){
//			return playerService.getPlayerRanks(date);
//		}
//		return playerService.getSeasonPlayerRanks();
//	}
//	
//	@RequestMapping("/getTeamPlayers")
//	public @ResponseBody List<Map<String,Object>> getTeamPlayers(int teamId){
//		//获取球队球员列表（包含球员各项基本数据统计：得分、篮板、助攻、抢断、盖帽等）
//		return playerService.getTeamPlayers(teamId);
//	}
//	
//	@RequestMapping("/getPlayerInfo")
//	public @ResponseBody Player getPlayerInfo(int playerId){
//		//获取球员基本信息
//		return playerService.getPlayerInfo(playerId);
//	}
//	
//	@RequestMapping("/getPlayerSeasonStatistics")
//	public @ResponseBody Map<String,Object> getPlayerSeasonStatistics(int playerId){
//		//获取球员赛季数据统计
//		return playerService.getPlayerSeasonStatistics(playerId);
//	}
//	
}
