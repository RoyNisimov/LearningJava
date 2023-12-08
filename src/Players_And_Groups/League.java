package Players_And_Groups;

public class League {
    private String name;
    private Group[] groups;
    public League(String name, Group[] groups){
        setGroups(groups);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Group getBestGroup(){
        Group last = getGroups()[0];
        for (int i = 0; i < getGroups().length; i++) {
            if(getGroups()[i].compare(last)){
                last = getGroups()[i];
            }
        }
        return last;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        Group[] toSetGroup = new Group[5];
        int length = 5;
        if (groups.length < 5){
            length = groups.length;
        }
        for (int i = 0; i < length; i++) {
            toSetGroup[i] = groups[i];
        }
        this.groups = toSetGroup;
    }
}
