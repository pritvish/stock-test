import com.app.model.Stock;
import com.app.service.StockService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StockServiceTest {

    StockService stockService = new StockService();

    List<Stock> stockList = null;

    @Before
    public void init() {
        stockList = Stock.stockList();
    }

    @Test
    public void testStockAddition() {
        Stock stock = new Stock(5, "fridge", 45678, 1234);
        List<Stock> newStockList = stockService.addStockList(stock);
        Assert.assertEquals(stockList.size() + 1, newStockList.size());
    }

    @Test
    public void testStockModify() {
        Stock stock = new Stock(5,"fridge",45678,1234);
        List<Stock> newStockList = stockService.addStockList(stock);
        Assert.assertEquals(45678, newStockList.get(4).getPrice());
    }

    @Test
    public void testStockDeletion() {
        Stock stock = new Stock(1, "laptop", 40000, 7000);
        List<Stock> newStockList = stockService.deleteStockList(0);
        Assert.assertEquals(stockList.size() - 1, newStockList.size());
    }

    @AfterClass
    public static void afterClass() {
        List<Stock> stockList = Stock.stockList();
        stockList.add(0,new Stock(1, "laptop", 40000, 7000));
    }
}
