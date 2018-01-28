package cse.sust.kidslearning;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirstyCrowTwo extends Fragment {

    private Button play1,play2,play3;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.thirsty_crow02,container,false);
        final MediaPlayer mediaPlayer001=MediaPlayer.create(getActivity(),R.raw.thirsty_crow_two);
        //final MediaPlayer mediaPlayer002=MediaPlayer.create(getActivity(),R.raw.lion_mouse_two);
       // final MediaPlayer mediaPlayer003=MediaPlayer.create(getActivity(),R.raw.lion_mouse_three);

        play1=(Button)view.findViewById(R.id.ThirstyCrowPlay02);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer001.isPlaying()){
                    mediaPlayer001.pause();
                    if(v == play1) {
                        play1.setBackgroundResource(R.drawable.playicon);
                    }
                } else {
                    mediaPlayer001.start();
                    if(v == play1) {
                        play1.setBackgroundResource(R.drawable.pauseicon);
                    }
                }

            }
        });

        return view;
    }
}
