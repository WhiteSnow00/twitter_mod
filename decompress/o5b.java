import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public interface o5b
{
    int b(final int p0, final int p1, final int p2);
    
    void c(final View p0, final int p1, final int p2, final q5b p3);
    
    View d(final int p0);
    
    int e(final int p0, final int p1, final int p2);
    
    void g(final q5b p0);
    
    int getAlignContent();
    
    int getAlignItems();
    
    int getFlexDirection();
    
    int getFlexItemCount();
    
    List<q5b> getFlexLinesInternal();
    
    int getFlexWrap();
    
    int getLargestMainSize();
    
    int getMaxLine();
    
    int getPaddingBottom();
    
    int getPaddingEnd();
    
    int getPaddingLeft();
    
    int getPaddingRight();
    
    int getPaddingStart();
    
    int getPaddingTop();
    
    int getSumOfCrossSize();
    
    int h(final View p0);
    
    View i(final int p0);
    
    void j(final int p0, final View p1);
    
    int k(final View p0, final int p1, final int p2);
    
    boolean l();
    
    void setFlexLines(final List<q5b> p0);
}
