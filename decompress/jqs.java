import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqs implements iqs
{
    public final tcn a;
    public final x6a<sqs> b;
    
    public jqs(final tcn a) {
        this.a = a;
        this.b = new jqs$a(a);
    }
    
    public final void a(final sqs sqs) {
        this.a.b();
        this.a.c();
        try {
            ((x6a)this.b).f((Object)sqs);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final sqs b(int b) {
        final d2o c = d2o.c("SELECT * FROM times WHERE day = ?", 1);
        c.t2(1, (long)b);
        this.a.b();
        final Cursor b2 = od7.b(this.a, (ozr)c, false);
        try {
            final int b3 = i97.b(b2, "day");
            b = i97.b(b2, "clicks");
            final int b4 = i97.b(b2, "dissmisses");
            final int b5 = i97.b(b2, "unlocks");
            final int b6 = i97.b(b2, "active");
            final int b7 = i97.b(b2, "charging");
            final boolean moveToFirst = b2.moveToFirst();
            sqs sqs = null;
            if (moveToFirst) {
                sqs = new sqs();
                sqs.a = b2.getInt(b3);
                if (b2.isNull(b)) {
                    sqs.b = null;
                }
                else {
                    sqs.b = b2.getString(b);
                }
                if (b2.isNull(b4)) {
                    sqs.c = null;
                }
                else {
                    sqs.c = b2.getString(b4);
                }
                if (b2.isNull(b5)) {
                    sqs.d = null;
                }
                else {
                    sqs.d = b2.getString(b5);
                }
                if (b2.isNull(b6)) {
                    sqs.e = null;
                }
                else {
                    sqs.e = b2.getString(b6);
                }
                if (b2.isNull(b7)) {
                    sqs.f = null;
                }
                else {
                    sqs.f = b2.getString(b7);
                }
            }
            return sqs;
        }
        finally {
            b2.close();
            c.release();
        }
    }
}
