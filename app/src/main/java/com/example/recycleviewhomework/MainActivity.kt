package com.example.recycleviewhomework

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
       lateinit var result: ArrayList<Employe>
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter : EmplyeAdapter? = null
        var empList : ArrayList<Employe>

        empList = generateEmployeeData()
        adapter = EmplyeAdapter(this, empList)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_emp.setLayoutManager(layoutManager)

        rv_emp.adapter =adapter
    }

    private fun generateEmployeeData(): ArrayList<Employe> {
       result  = ArrayList<Employe>()

        var emp: Employe = Employe()
        emp.emp_id = 1
        emp.emp_name = "Patric Kopitov"
        emp.emp_designation = "President"
        emp.emp_salary = "USD ------$"
        emp.emp_photo = R.drawable.b1
        result.add(emp)

        emp = Employe()
        emp.emp_id = 2
        emp.emp_name = "Arnold Greeder"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 18000$"
        emp.emp_photo = R.drawable.b2
        result.add(emp)

        emp = Employe()
        emp.emp_id = 3
        emp.emp_name = "Oksana Kobylko"
        emp.emp_designation = "Manager"
        emp.emp_salary = "USD 3000$"
        emp.emp_photo = R.drawable.b3
        result.add(emp)

        emp = Employe()
        emp.emp_id = 4
        emp.emp_name = "Petro Mogila"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 3100$"
        emp.emp_photo = R.drawable.b4
        result.add(emp)

        emp = Employe()
        emp.emp_id = 5
        emp.emp_name = "Sergey Gavrilov"
        emp.emp_designation = "Driver"
        emp.emp_salary = "USD 1200$"
        emp.emp_photo = R.drawable.b5
        result.add(emp)

        emp = Employe()
        emp.emp_id = 6
        emp.emp_name = "Masha Malina"
        emp.emp_designation = "Singer"
        emp.emp_salary = "USD 2000$"
        emp.emp_photo = R.drawable.g1
        result.add(emp)

        emp = Employe()
        emp.emp_id = 7
        emp.emp_name = "Petya Gdanov"
        emp.emp_designation = "Teacher"
        emp.emp_salary = "USD 1000$"
        emp.emp_photo = R.drawable.b6
        result.add(emp)

        emp = Employe()
        emp.emp_id = 8
        emp.emp_name = "Natasha Ponkova"
        emp.emp_designation = "Model"
        emp.emp_salary = "USD 3000$"
        emp.emp_photo = R.drawable.g2
        result.add(emp)

        emp = Employe()
        emp.emp_id = 9
        emp.emp_name = "Yana Curkchi"
        emp.emp_designation = "Freelancer"
        emp.emp_salary = "USD 2000$"
        emp.emp_photo = R.drawable.g3
        result.add(emp)

        return result
    }
}
