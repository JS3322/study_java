import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BatchMapper {
	List<WorkListResponseVO> selectWorkList();
}