import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d implements Comparator<Thread>
{
    public final Thread D0;
    
    public d(final Thread d0) {
        this.D0 = d0;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final Thread thread = (Thread)o;
        final Thread thread2 = (Thread)o2;
        int compareTo;
        if (thread == thread2) {
            compareTo = 0;
        }
        else {
            final Thread d0 = this.D0;
            if (thread == d0) {
                compareTo = 1;
            }
            else if (thread2 == d0) {
                compareTo = -1;
            }
            else {
                compareTo = thread2.getName().compareTo(thread.getName());
            }
        }
        return compareTo;
    }
}
