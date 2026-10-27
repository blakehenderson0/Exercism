class Badge {
    public String print(Integer id, String name, String department) {

        String output = "";

        switch (id) {
            case null:
                if (department == null) {
                    output = (name+" - "+"OWNER");
                    return output;
                } else if (department != null)
                    output = (name+" - "+department.toUpperCase());
                    return output;
            default:
                if (department == null) {
                    output = ("["+id+"]"+" - "+name+" - "+"OWNER");
                    return output;
                } else if (department != null)
                    output = ("["+id+"]"+" - "+name+" - "+department.toUpperCase());
                    return output;
        }
    }
}
