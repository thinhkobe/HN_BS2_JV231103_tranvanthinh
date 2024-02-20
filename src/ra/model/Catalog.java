package ra.model;

import ra.until.InputMethods;

import java.util.Scanner;

public class Catalog {
    private int catalogId;
    private String catalogName,descriptions;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, String descriptions) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    // Phương thức nhập thông tin
    public void inputCatalogInfo(boolean isAdd) {


          if (isAdd){
              // Nhập catalogId với kiểm tra tính hợp lệ
              while (true) {
                  try {
                      System.out.print("Nhập catalogId: ");
                      int inputCatalogId = InputMethods.getInteger();
                      setCatalogId(inputCatalogId);
                      break; // Nếu nhập thành công, thoát khỏi vòng lặp
                  } catch (Exception e) {
                      System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                  }
              }
          }




        // Nhập catalogName với kiểm tra tính hợp lệ
        while (true) {
            System.out.print("Nhập catalogName: ");
            String inputCatalogName =InputMethods.getString().trim();
            if (!inputCatalogName.isEmpty()) {
                setCatalogName(inputCatalogName);
                break; // Nếu nhập thành công, thoát khỏi vòng lặp
            } else {
                System.out.println("Tên catalog không được để trống. Vui lòng nhập lại.");
            }
        }

        // Nhập descriptions với kiểm tra tính hợp lệ
        while (true) {
            System.out.print("Nhập descriptions: ");
            String inputDescriptions =InputMethods.getString().trim();
            if (!inputDescriptions.isEmpty()) {
                setDescriptions(inputDescriptions);
                break; // Nếu nhập thành công, thoát khỏi vòng lặp
            } else {
                System.out.println("Mô tả không được để trống. Vui lòng nhập lại.");
            }
        }
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }
}
