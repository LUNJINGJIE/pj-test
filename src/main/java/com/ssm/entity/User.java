package com.ssm.entity;


public class User{

    // Fields

    private Integer id;
    private TAllawardcount TAllawardcount;
    private Role role;
    private String name;
    private String password;
    private String headImage;

    // Constructors

    /** default constructor */
    public User() {
    }

    /** minimal constructor */
    public User(Role role, String name, String password) {
        this.role = role;
        this.name = name;
        this.password = password;
    }

    /** full constructor */
    public User(TAllawardcount TAllawardcount, Role role, String name,
                String password, String headImage) {
        this.TAllawardcount = TAllawardcount;
        this.role = role;
        this.name = name;
        this.password = password;
        this.headImage = headImage;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public TAllawardcount getTAllawardcount() {
        return this.TAllawardcount;
    }

    public void setTAllawardcount(TAllawardcount TAllawardcount) {
        this.TAllawardcount = TAllawardcount;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", TAllawardcount=" + TAllawardcount +
                ", role=" + role +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", headImage='" + headImage + '\'' +
                '}';
    }
}