# JavaBasics-Assignment-601
Calculate BMI and Manage East Asia Countries
Project Descriptions:
1. Exercise 1
Viết một chương trình máy tính bao gồm các chức năng cộng, trừ, nhân, chia, tính số mũ và chỉ số BMI.

Cộng, Trừ, Nhân, Chia, Tính số mũ chỉ dừng lại khi người dùng nhập =

BMI được tính như sau:

        BMI = (trọng lượng cơ thể)/ (chiều cao x chiều cao).

Trọng lượng cơ thể: tính bằng kg.

Chiều cao x chiều cao: tính bằng m.

Hiển thị thông báo về tình trạng cơ thể cho người dùng :

Dưới chuẩn: BMI ít hơn 19 

Chuẩn: BMI từ 19 - 25

Thừa cân: BMI từ 25 - 30 

Béo - nên giảm cân: BMI 30 -  40

Rất béo – cần giảm cân ngay: BMI trên 40 

Yêu cầu giao diện:



Yêu cầu chức năng:

Điều kiện tiền đề:

Người dùng chạy ứng dụng, chương trình hiển thị màn hình menu yêu cầu người dùng chọn chức năng cần sử dụng.

Tiếp đó, chương trình thực hiện chức năng đã được lựa chọn và đưa ra kết quả sau đó trở về menu.

Chức năng 1: Máy tính bình thường

Tên hàm trong code: public double calculate(double a, Operator operator, double b)

Đầu vào:

a: số thứ nhất.

operator: toán tử.

b: số thứ hai.

Giá trị trả về: kết quả tính toán.

Chức năng 2: Máy tính chỉ số BMI.

Tên hàm trong code: public BMI calculateBMI(double weight, double height)

Đầu vào:

weight: Cân nặng tính bằng kg.

height: Chiều cao tính bằng cm.

Giá trị trả về: Enum chứa trạng thái vào chỉ số BMI.

Hướng dẫn cho học viên

Gợi ý:

Dùng hàm Math.pow(a, b) để tính số mũ .

Dùng swich case để swich(enum).

Dùng try catch để bắt NumberFormatException, NullPointerException

Dùng if để bắt  ArithmeticException trường hợp chia cho 0.

Dùng hàm public Operator checkOperator(String operator) để kiểm tra xem toán tử nhập vào có phù hợp không hàm nếu phù hợp hàm này sẽ trả về Enum Operator cộng trừ nhân chia, số mũ, dấu = ngược lại trả về null.

Dùng hàm public Double checkIn(String inputVal) để kiểm tra toán hạng nhập vào có phải là số? Nếu không phải thì trả về null.

Thời gian ước tính: 90 phút

2. Exercise 2
Xây dựng lớp Country các thuộc tính và phương thức sau:

protected String countryCode;

protected String countryName;

protected float totalArea;

Cài đặt 2 constructor, một có tham số và 1 không có tham số.
Cài đặt đầy đủ các hàm set/get cho các thuộc tính.
Cài đặt hàm display() để hiển thị thông tin của 1 đất nước.

Xây dựng lớp EastAsiaCountries kế thừa lớp Country và bổ sung thêm thuộc tính:

private String countryTerrain;

Override display().

Cài đặt constructor có tham số và dùng từ khóa super để gọi constructor của lớp Country ở trên.


Xây dựng ManageEastAsiaCountries thực hiện các chức năng:

Nhập thông tin cho 11 đất nước ở Đông Nam Á.

Hiển thị thông tin vừa nhập

Tìm kiếm thông tin đất nước theo tên nước nhập vào.

Hiển thị thông tin tăng dần theo tên đất nước.

Thoát

Yêu cầu giao diện:



Yêu cầu chức năng:

Điều kiện tiền đề:

Người dùng chạy ứng dụng, chương trình hiển thị màn hình menu yêu cầu người dùng chọn chức năng cần sử dụng.

Tiếp đó, chương trình thực hiện chức năng đã được lựa chọn và đưa ra kết quả sau đó trở về menu.

Chức năng 1: Thêm thông tin cho một nước

Tên hàm trong code: public void addCountryInformation(EastAsiaCountries country) throws Exception

Đầu vào:

country: Thông tin của một nước.

Giá trị trả về: Danh sách exception.

Chức năng 2: Hiển thị nước vừa được nhập

Tên hàm trong code: public EastAsiaCountries getRecentlyEnteredInformation() throws Exception

Đầu vào:

Giá trị trả về: kết quả hoặc Exception.

Chức năng 3: Tìm nước theo tên

Tên hàm trong code: public EastAsiaCountries[] searchInformationByName(String name) throws Exception

Đầu vào:

name: tên nước.

Giá trị trả về: kết quả các nước tìm thấy.

Chức năng 4: Hiển thị tên nước theo tên tăng dần

Tên hàm trong code: public EastAsiaCountries[]sortInformationByAscendingOrder() throws Exception

Đầu vào:

Giá trị trả về: danh sách đã được sắp xếp.

Thời gian ước tính: 90 phút
