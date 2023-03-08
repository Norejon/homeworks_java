import Additional.Comments;
import Additional.Posts;
import part1.Adress;
import part1.Company;
import part1.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// part-1
//        Adress adress = new part1.Adress("a","B","C","D");
//        Company company = new part1.Company("ss","qq","bsssss");
//
//        User user = new part1.User("Max","pro100maximka","killer@gmail.com",adress,24.3,2.1,"228ss","pornhub.com",company);
//        System.out.println(user);

        // part-4


//        ArrayList<Skills> skills1 = new ArrayList<Skills>();
//        skills1.add(new Skills("a",3));
//        skills1.add(new Skills("b",5));
//        skills1.add(new Skills("c",1));
//
//        Human human = new Human(0,"Danylo","Dubovskiy","dandub@gmail.com",21, Gender.MALE,skills1,"bobik",2000,1);
//        System.out.println(human);


        //part-5 Advanced

        ArrayList<Comments> comments = new ArrayList<Comments>();
        comments.add(new Comments(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comments(1,2,"quo vero reiciendis velit similique earum","Jayne_Kuhic@sydney.com","est natus enim nihil est dolore omnis voluptatem numquam\\net omnis occaecati quod ullam at\\nvoluptatem error expedita pariatur\\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comments(1,3,"odio adipisci rerum aut animi","Nikita@garfield.biz","quia molestiae reprehenderit quasi aspernatur\\naut expedita occaecati aliquam eveniet laudantium\\nomnis quibusdam delectus saepe quia accusamus maiores nam est\\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comments(2,7,"repellat consequatur praesentium vel minus molestias voluptatum","Dallas@ole.me","maiores sed dolores similique labore et inventore et\\nquasi temporibus esse sunt id et\\neos voluptatem aliquam\\naliquid ratione corporis molestiae mollitia quia et magnam dolor"));
        comments.add(new Comments(2,8,"et omnis dolorem","Mallory_Kunze@marie.org","ut voluptatem corrupti velit\\nad voluptatem maiores\\net nisi velit vero accusamus maiores\\nvoluptates quia aliquid ullam eaqu"));
        comments.add(new Comments(3,13,"aut inventore non pariatur sit vitae voluptatem sapiente","Kariane@jadyn.tv","fuga eos qui dolor rerum\\ninventore corporis exercitationem\\ncorporis cupiditate et deserunt recusandae est sed quis culpa\\neum maiores corporis et"));
        comments.add(new Comments(3,14,"et officiis id praesentium hic aut ipsa dolorem repudiandae","Nathan@solon.io","vel quae voluptas qui exercitationem\\nvoluptatibus unde sed\\nminima et qui ipsam aspernatur\\nexpedita magnam laudantium et et quaerat ut qui dolorum"));
        comments.add(new Comments(3,15,"debitis magnam hic odit aut ullam nostrum tenetur","Maynard.Hodkiewicz@roberta.com","nihil ut voluptates blanditiis autem odio dicta rerum\\nquisquam saepe et est\\nsunt quasi nemo laudantium deserunt\\nmolestias tempora quo quia"));

        ArrayList<Posts> posts = new ArrayList<Posts>();
        posts.add(new Posts(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Posts(1,2,"qui est esse","est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla"));
        posts.add(new Posts(1,3,"ea molestias quasi exercitationem repellat qui ipsa sit aut","et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut"));

        ArrayList<Posts> postsWithComments = new ArrayList<Posts>();

        //НЕ ЗРОБЛЕНО
//        for(Posts post : posts){
//            for (Comments com:comments){
//                posts.add(post.setComments());
//                if(com.getPostId()==post.getId()){
//                }
//            }
//        }
//        System.out.println(posts);

    }
}