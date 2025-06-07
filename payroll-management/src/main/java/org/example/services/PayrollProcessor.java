package org.example.services;

import org.example.model.Employee;

import java.lang.reflect.Method;

public class PayrollProcessor {
    public static void processPayroll(Employee employee){
        try {
            Method method=employee.getClass().getMethod("calculateSalary");
            if (method.isAnnotationPresent(PayrollAdjustment.class)){
                PayrollAdjustment annotation=method.getAnnotation(PayrollAdjustment.class);
                double baseSalary= employee.getBaseSalary();
                int overtimeHours=employee.getOvertimeHours();
                double taxRate= annotation.taxRate();
                double overtimeRate=annotation.overtimeRate();
                double overtimePay=overtimeHours*(baseSalary/160)*overtimeRate;
                double grossSalary=baseSalary+overtimePay;
                double finalSalary=grossSalary-(grossSalary*taxRate);
                Method setFinalSalary=Employee.class.getDeclaredMethod("setFinalSalary",double.class);
                setFinalSalary.setAccessible(true);
                setFinalSalary.invoke(employee,finalSalary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
