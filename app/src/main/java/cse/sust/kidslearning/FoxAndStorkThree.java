package cse.sust.kidslearning;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FoxAndStorkThree extends Fragment {

    private Button play1,play2,play3;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fox_and_stork03,container,false);
        //final MediaPlayer mediaPlayer001=MediaPlayer.create(getActivity(),R.raw.lion_mouse_one);
        final MediaPlayer mediaPlayer002=MediaPlayer.create(getActivity(),R.raw.foxncrow_three);
        //final MediaPlayer mediaPlayer003=MediaPlayer.create(getActivity(),R.raw.lion_mouse_three);

        play1=(Button)view.findViewById(R.id.FoxAndStorkPlay03);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer002.isPlaying()){
                    mediaPlayer002.pause();
                    if(v == play1) {
                        play1.setBackgroundResource(R.drawable.playicon);
                    }
                } else {
                    mediaPlayer002.start();
                    if(v == play1) {
                        play1.setBackgroundResource(R.drawable.pauseicon);
                    }
                }
            }
        });

        return view;
    }
}
