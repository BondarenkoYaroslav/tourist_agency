package com.bondarenko.agency.controller;

import com.bondarenko.agency.entity.Employees;
import com.bondarenko.agency.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping()
    public String getEmployees(Model model) {

        List<Employees> empList = employeesService.getAllEmployees();
        model.addAttribute("empList", empList);

        return "employee/employee_list";
    }

    @GetMapping("/add")
    public String addEmployee(Model model) {

        model.addAttribute("emp", new Employees());

        return "employee/employee_form";
    }

    @GetMapping("/edit")
    public String editEmployee(@RequestParam("empId") int empId, Model model) {

        Employees employee = employeesService.getEmployee(empId);
        model.addAttribute("emp", employee);

        return "employee/employee_form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("empId") int empId) {

        employeesService.deleteEmployee(empId);

        return "redirect:/employee";
    }

    @PostMapping("/save")
    public String saveOrUpdateEmployee(@ModelAttribute("emp") Employees employee) {

        employeesService.saveOrUpdateEmployee(employee);

        return "redirect:/employee";
    }
}
