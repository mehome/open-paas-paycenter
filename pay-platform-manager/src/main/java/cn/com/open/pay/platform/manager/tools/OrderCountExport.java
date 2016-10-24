package cn.com.open.pay.platform.manager.tools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import cn.com.open.pay.platform.manager.order.model.MerchantOrderInfo;
import cn.com.open.pay.platform.manager.order.model.MerchantOrderOffline;


public class OrderCountExport {
	
	
	public static void exportChuBei(HttpServletResponse response,List<MerchantOrderInfo> infoList) {
		/*SecuritySubject user = getUser(request);
		String userId = user.getCode();*/

		// 声明一个工作薄
		HSSFWorkbook wb = new HSSFWorkbook();
		// 声明一个单子并命名
		HSSFSheet sheet = wb.createSheet("StoringTalentExcel");  
		// 给单子名称一个长度
		sheet.setDefaultColumnWidth((short) 50);
		// 生成一个样式
		HSSFCellStyle style = wb.createCellStyle();
		// 创建第一行（也可以称为表头）
		HSSFRow row = sheet.createRow(0);
		// 样式字体居中
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 给表头第一行一次创建单元格
		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("成交金额");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("成交笔数");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("缴费人数");
		cell.setCellStyle(style);
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("手续费");
		cell.setCellStyle(style);
		cell.setCellStyle
		(style);
		cell = row.createCell((short) 4);
		cell.setCellValue("日期");
		cell.setCellStyle(style);
		cell.setCellStyle

		(style);
		
		/*cell = row.createCell((short) 11);
		cell.setCellValue("人才使用");
		cell.setCellStyle(style);*/
		// 向单元格里填充数据
		for (short i = 0; i < infoList.size(); i++) {
			row = sheet.createRow(i + 1);
			row.createCell(0).setCellValue(infoList.get(i).getOrderAmount());//成交金额
			row.createCell(1).setCellValue(infoList.get(i).getMerchantOrderId());//成交笔数
			row.createCell(2).setCellValue(infoList.get(i).getSourceUid());//缴费人数
			if(infoList.get(i).getPayCharge()!=null){
				row.createCell(3).setCellValue(infoList.get(i).getPayCharge());//手续费
			}else{
				row.createCell(3).setCellValue("0");//手续费
			}
			
			row.createCell(4).setCellValue(infoList.get(i).getFoundDate());//日期
			
			//人才使用总和
			//String thingName="";
			/*String orderState="4";
			List<WfHistOrder> listWfHistOrderSy=wfOrderService.getMessageHistOrder(userId, orderState,thingName);
			int syNumber = listWfHistOrderSy.size();
			request.setAttribute("syNumber", syNumber);*/

			//row.createCell(11).setCellValue(infoList.get(i).getStrUiPclassFication());
		}
		try {
			response.setContentType("application/vnd.ms-excel");
			String filedisplay = "downloadOrder.xls";
			filedisplay = URLEncoder.encode(filedisplay, "UTF-8");
			response.addHeader("Content-Disposition", "attachment;filename="+ filedisplay);
			ServletOutputStream out = response.getOutputStream();
			wb.write(out);                                                      
			out.close();
//			JOptionPane.showMessageDialog(null, "导出成功!");
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "导出失败!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "导出失败!");
			e.printStackTrace();
		}
	}
	
	public static void exportOrderOffline(HttpServletResponse response,List<MerchantOrderOffline> offlines) {
		
		// 声明一个工作薄
		HSSFWorkbook wb = new HSSFWorkbook();
		// 声明一个单子并命名
		HSSFSheet sheet = wb.createSheet("StoringTalentExcel");  
		// 给单子名称一个长度
		sheet.setDefaultColumnWidth((short) 50);
		// 生成一个样式
		HSSFCellStyle style = wb.createCellStyle();
		// 创建第一行（也可以称为表头）
		HSSFRow row = sheet.createRow(0);
		// 样式字体居中
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 给表头第一行一次创建单元格
		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("订单号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("线下订单号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("收费商户");
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("收费金额");
		cell.setCellStyle(style);
		cell = row.createCell((short) 4);
		cell.setCellValue("缴费日期");
		cell.setCellStyle(style);
		cell = row.createCell((short) 5);
		cell.setCellValue("业务来源");
		cell.setCellStyle(style);
		cell = row.createCell((short) 6);
		cell.setCellValue("用户ID");
		cell.setCellStyle(style);
		cell = row.createCell((short) 7);
		cell.setCellValue("用户名");
		cell.setCellStyle(style);
		cell = row.createCell((short) 8);
		cell.setCellValue("真实姓名");
		cell.setCellStyle(style);
		cell = row.createCell((short) 9);
		cell.setCellValue("手机号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 10);
		cell.setCellValue("支付方式");
		cell.setCellStyle(style);
		cell = row.createCell((short) 11);
		cell.setCellValue("发卡行");
		cell.setCellStyle(style);
		cell = row.createCell((short) 12);
		cell.setCellValue("操作人");
		cell.setCellStyle(style);
		cell = row.createCell((short) 13);
		cell.setCellValue("录入时间");
		cell.setCellStyle(style);
		cell = row.createCell((short) 14);
		cell.setCellValue("备注");
		cell.setCellStyle(style);
		cell = row.createCell((short) 15);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 向单元格里填充数据
		for (short i = 0; i < offlines.size(); i++) {
			row = sheet.createRow(i + 1);
			row.createCell(0).setCellValue(offlines.get(i).getId());//用户中心订单号
			row.createCell(1).setCellValue(offlines.get(i).getMerchantOrderId());//线下订单号
			row.createCell(2).setCellValue(offlines.get(i).getMerchantName());//收费商户
			row.createCell(3).setCellValue(offlines.get(i).getMoney());//收费金额
			if(offlines.get(i).getPayTime()!=null){
				row.createCell(4).setCellValue(sdf.format(offlines.get(i).getPayTime()));//缴费日期
			}
			row.createCell(5).setCellValue(offlines.get(i).getAppName());//业务来源
			row.createCell(6).setCellValue(offlines.get(i).getSourceUid());//用户ID
			row.createCell(7).setCellValue(offlines.get(i).getSourceUserName());//用户名
			row.createCell(8).setCellValue(offlines.get(i).getRealName());//真实姓名
			row.createCell(9).setCellValue(offlines.get(i).getPhone());//手机号
			row.createCell(10).setCellValue(offlines.get(i).getChannelName());//支付方式
			row.createCell(11).setCellValue(offlines.get(i).getBankName());//发卡行
			row.createCell(12).setCellValue(offlines.get(i).getOperator());//操作人
			if(offlines.get(i).getCreateTime()!=null){
				row.createCell(13).setCellValue(sdf1.format(offlines.get(i).getCreateTime()));//录入时间
			}
			row.createCell(14).setCellValue(offlines.get(i).getRemark());//备注
		}
		try {
			response.setContentType("application/vnd.ms-excel");
			String filedisplay = "downloadOrderOffline.xls";
			filedisplay = URLEncoder.encode(filedisplay, "UTF-8");
			response.addHeader("Content-Disposition", "attachment;filename="+ filedisplay);
			ServletOutputStream out = response.getOutputStream();
			wb.write(out);                                                      
			out.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "导出失败!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "导出失败!");
			e.printStackTrace();
		}
	}
}