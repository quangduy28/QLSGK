package dao;

import java.util.ArrayList;

public interface DAOInterface<T> {

	public int insert(T t);

	public boolean insert2(T t);

	public int updata(T t);

	public boolean updata2(T t);

	public int delete(T t);

	public boolean delete2(T t);

	public ArrayList<T> selectAll();

	public T selectById(T t);

	public ArrayList<T> selectByCondition(String condition);

	public ArrayList<T> getList();

	public boolean in();

}