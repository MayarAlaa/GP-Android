package com.example.android.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String JSON_STRING ;

    private List<Movies> movies;
 //   ImageButton imageButton;
    public static final String EXTRA_MESSAGE = "com.example.android.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        imageButton = (ImageButton)findViewById(R.id.imageButton);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                getMoviesFromDB(0);

               // Toast.makeText(MainActivity.this, "Onclicklistener function called.", Toast.LENGTH_LONG).show();

        //    }
      //  });

    }

    public void getJSON(View view)
    {


    }


    class BackgroundTask extends AsyncTask<Void,Void,Void>

    {    String json_url ;
        @Override
        protected void onPreExecute() {
           // super.onPreExecute();
            json_url="http://192.168.1.106/movies.php";
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                URL url = new URL(json_url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }




    /** Called when the user taps the Locatebutton */
   // public void locate(View view) {
    //    Intent intent = new Intent(this, DisplayMessageActivity.class);
      //  EditText editText = (EditText) findViewById(R.id.imageButton);
       // String message = editText.getText().toString();
      //  intent.putExtra(EXTRA_MESSAGE, message);
     //   startActivity(intent);
   // }










//    private void getMoviesFromDB(int id) {
//
//        AsyncTask<Integer, Void, Void> asyncTask = new AsyncTask<Integer, Void, Void>() {
//            @Override
//            protected Void doInBackground(Integer... movieIds) {
//
//                OkHttpClient client = new OkHttpClient();
//                Request request = new Request.Builder()
//                        .url("http://192.168.1.106/movies.php?id=" + movieIds[0])
//                        .build();
//                try {
//                    Response response = client.newCall(request).execute();
//
//                    JSONArray array = new JSONArray(response.body().string());
//
//                    for (int i = 0; i < array.length(); i++) {
//
//                        JSONObject object = array.getJSONObject(i);
//
//                        Movies movie = new Movies(object.getInt("id"), object.getString("movie_name"),
//                                object.getString("movie_image"), object.getString("movie_genre"));
//
//                        MainActivity.this.movies.add(movie);
//                    }
//
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                return null;
//            }
//
//            @Override
//            protected void onPostExecute(Void aVoid) {
//               // adapter.notifyDataSetChanged();
//            }
//        };
//
//        asyncTask.execute(id);
//    }

}






