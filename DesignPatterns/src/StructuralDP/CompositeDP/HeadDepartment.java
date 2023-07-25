package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeadDepartment implements Department {

     //bütün departmanları bir field üzerinde tutalım
    public List<Department> childDepartments=new ArrayList<>();

    //departmanları listeye ekleyelim
    public void add(Department department){
        this.childDepartments.add(department);
    }

    @Override
    public String getName() {//firmadaki tüm departmanların isimlerini döndürsün
        return this.childDepartments.stream().
                                     map(d->d.getName()).//finance sales
                                     collect(Collectors.joining(","));//"finance ,sales"
    }

    @Override
    public List<String> getEmployees() {//firmadaki tüm çalışanların isimlerini listelesin
        return this.childDepartments.stream().
                                      flatMap(d->d.getEmployees().stream()).
                                      collect(Collectors.toList());

        //aynı işlemi for each ile de yapabilirdik.

    }










}
