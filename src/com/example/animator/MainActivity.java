package com.example.animator;

import java.security.PublicKey;

import android.R.id;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void viewclick(View view)
	{
		Toast.makeText(this, "Å­µã", Toast.LENGTH_SHORT).show();
	}
	public void move(View view)
	{
		ImageView imageView = (ImageView) findViewById(R.id.image);
//		ObjectAnimator.ofFloat(imageView, "rotation", 0F,200F).setDuration(1000).start();
//		ObjectAnimator.ofFloat(imageView, "translationX", 0F,200F).setDuration(1000).start();
//		ObjectAnimator.ofFloat(imageView, "translationY", 0F,200F).setDuration(1000).start();
		
//	PropertyValuesHolder p1 = PropertyValuesHolder.ofFloat("rotation", 0F,200F);	
//	PropertyValuesHolder p2 = PropertyValuesHolder.ofFloat("translationX", 0F,200F);	
//	PropertyValuesHolder p3 = PropertyValuesHolder.ofFloat("translationY", 0F,200F);	
//	ObjectAnimator.ofPropertyValuesHolder(imageView, p1,p2,p3).setDuration(1000).start();
		
		ObjectAnimator animator1 =ObjectAnimator.ofFloat(imageView, "rotation", 0F,200F);
		ObjectAnimator animator2 =ObjectAnimator.ofFloat(imageView, "translationX", 0F,200F);
		ObjectAnimator animator3 =ObjectAnimator.ofFloat(imageView, "translationY", 0F,200F);
		AnimatorSet set = new AnimatorSet();
		set.playTogether(animator1,animator2,animator3);
		set.setDuration(1000);
		set.start();
	
	}
	
	public void click(View view)
	{
//		ObjectAnimator animator = ObjectAnimator .ofFloat(view, "alpha", 0F,1F);
//		animator.setDuration(1000);
//		animator.addListener(new AnimatorListenerAdapter() {
//			@Override
//			public void onAnimationEnd(Animator animation) {
//				// TODO Auto-generated method stub
//				super.onAnimationEnd(animation);
//				Toast.makeText(MainActivity.this, "anim end", Toast.LENGTH_LONG).show();
//			}
//		});
//		animator.addListener(new AnimatorListener() {
//			
//			@Override
//			public void onAnimationStart(Animator animation) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onAnimationRepeat(Animator animation) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onAnimationEnd(Animator animation) {
//				// TODO Auto-generated method stub
//				Toast.makeText(MainActivity.this, "anim end", Toast.LENGTH_LONG).show();
//			}
//			
//			@Override
//			public void onAnimationCancel(Animator animation) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		animator.start();
	
		ValueAnimator animator = ValueAnimator.ofObject(new TypeEvaluator<PointF>() {

			@Override
			public PointF evaluate(float fraction, PointF startValue,
					PointF endValue) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
	}
}
