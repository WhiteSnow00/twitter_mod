import android.database.AbstractCursor;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.io.IOException;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.File;
import android.database.MatrixCursor;
import android.os.Build$VERSION;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class od7
{
    public static void a(final lzr lzr) {
        final ArrayList list = new ArrayList();
        final mpb mpb = (mpb)lzr;
        Objects.requireNonNull(mpb);
        Object o = mpb.W((ozr)new k9q("SELECT name FROM sqlite_master WHERE type = 'trigger'"));
        try {
            while (((Cursor)o).moveToNext()) {
                list.add(((Cursor)o).getString(0));
            }
            ((Cursor)o).close();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                o = iterator.next();
                if (((String)o).startsWith("room_fts_content_sync_")) {
                    o = hmg.h("DROP TRIGGER IF EXISTS ", (String)o);
                    ((mpb)lzr).x((String)o);
                }
            }
        }
        finally {
            ((Cursor)o).close();
        }
    }
    
    public static Cursor b(tcn tcn, final ozr ozr, final boolean b) {
        final Cursor o = tcn.o(ozr);
        if (b && o instanceof AbstractWindowedCursor) {
            tcn = (tcn)o;
            final int count = ((AbstractCursor)tcn).getCount();
            int numRows;
            if (((AbstractWindowedCursor)tcn).hasWindow()) {
                numRows = ((AbstractWindowedCursor)tcn).getWindow().getNumRows();
            }
            else {
                numRows = count;
            }
            if (Build$VERSION.SDK_INT >= 23) {
                if (numRows >= count) {
                    return o;
                }
            }
            try {
                final MatrixCursor matrixCursor = new MatrixCursor(((Cursor)tcn).getColumnNames(), ((Cursor)tcn).getCount());
                while (((Cursor)tcn).moveToNext()) {
                    final Object[] array = new Object[((Cursor)tcn).getColumnCount()];
                    for (int i = 0; i < ((Cursor)tcn).getColumnCount(); ++i) {
                        final int type = ((Cursor)tcn).getType(i);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type != 4) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = ((Cursor)tcn).getBlob(i);
                                    }
                                    else {
                                        array[i] = ((Cursor)tcn).getString(i);
                                    }
                                }
                                else {
                                    array[i] = ((Cursor)tcn).getDouble(i);
                                }
                            }
                            else {
                                array[i] = ((Cursor)tcn).getLong(i);
                            }
                        }
                        else {
                            array[i] = null;
                        }
                    }
                    matrixCursor.addRow(array);
                }
                return (Cursor)matrixCursor;
            }
            finally {
                ((Cursor)tcn).close();
            }
        }
        return o;
    }
    
    public static int c(final File file) throws IOException {
        AbstractInterruptibleChannel channel;
        final AbstractInterruptibleChannel abstractInterruptibleChannel = channel = null;
        try {
            final ByteBuffer allocate = ByteBuffer.allocate(4);
            channel = abstractInterruptibleChannel;
            channel = abstractInterruptibleChannel;
            final FileInputStream fileInputStream = new FileInputStream(file);
            channel = abstractInterruptibleChannel;
            final FileChannel fileChannel = (FileChannel)(channel = fileInputStream.getChannel());
            fileChannel.tryLock(60L, 4L, true);
            channel = fileChannel;
            fileChannel.position(60L);
            channel = fileChannel;
            if (fileChannel.read(allocate) == 4) {
                channel = fileChannel;
                allocate.rewind();
                channel = fileChannel;
                final int int1 = allocate.getInt();
                fileChannel.close();
                return int1;
            }
            channel = fileChannel;
            channel = fileChannel;
            final IOException ex = new IOException("Bad database header, unable to read 4 bytes at offset 60");
            channel = fileChannel;
            throw ex;
        }
        finally {
            if (channel != null) {
                channel.close();
            }
        }
    }
}
