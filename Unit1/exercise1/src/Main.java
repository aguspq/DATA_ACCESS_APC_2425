import java.util.ArrayList;


class Student {
    private String name;
    private int score;

    // sacar getters / setters
    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Aproved
    public boolean isApproved() {
        return score >= 5;
    }
}

class Students
{
    //private ArrayList studentList = new ArrayList();
    private ArrayList<Student> studentList = new ArrayList<>();

    // Agrega un nuevo alumno a la lista
    //
    public void add(Student stu)
    {
        studentList.add(stu);
    }

    // Devuelve el alumno que está en la posición num
    //
    public Student getStudent(int num)
    {
        if (num >= 0 && num < studentList.size())
        {
            return studentList.get(num);
        }
        return null;
    }

    // Devuelve la nota average de los alumnos
    //
    public float getAverage(){
        if(studentList.isEmpty()){
            return 0;
        }

        float average = 0;
        for (Student stu : studentList){
            average += stu.getScore();
        }
        return average / studentList.size();
    }
}




