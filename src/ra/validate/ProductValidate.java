package ra.validate;

public class ProductValidate {
    // Các phương thức kiểm tra tính hợp lệ
    public String validateProductId(String productId) {
        if (productId == null || !productId.matches("P\\d{4}")) {
            throw new IllegalArgumentException("ProductId không hợp lệ");
        }
        // Thực hiện logic kiểm tra và trả về productId đã được xác nhận tính hợp lệ
        return productId;
    }

    public String validateProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được để trống");
        }
        // Thực hiện logic kiểm tra và trả về productName đã được xác nhận tính hợp lệ
        return productName;
    }

    public double validateProductPrice(double productPrice) {
        if (productPrice <= 0) {
            throw new IllegalArgumentException("Giá sản phẩm phải lớn hơn 0");
        }
        // Thực hiện logic kiểm tra và trả về productPrice đã được xác nhận tính hợp lệ
        return productPrice;
    }

    public int validateStock(int stock) {
        if (stock < 10) {
            throw new IllegalArgumentException("Tồn kho phải ít nhất là 10");
        }
        // Thực hiện logic kiểm tra và trả về stock đã được xác nhận tính hợp lệ
        return stock;
    }
}
