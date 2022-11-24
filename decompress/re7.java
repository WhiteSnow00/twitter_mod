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

public final class re7
{
    public static void a(final h0s h0s) {
        final ArrayList list = new ArrayList();
        final oqb oqb = (oqb)h0s;
        Objects.requireNonNull(oqb);
        Object o = oqb.X((k0s)new haq("SELECT name FROM sqlite_master WHERE type = 'trigger'"));
        try {
            while (((Cursor)o).moveToNext()) {
                list.add(((Cursor)o).getString(0));
            }
            ((Cursor)o).close();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                o = iterator.next();
                if (((String)o).startsWith("room_fts_content_sync_")) {
                    o = mqb.l("DROP TRIGGER IF EXISTS ", (String)o);
                    ((oqb)h0s).y((String)o);
                }
            }
        }
        finally {
            ((Cursor)o).close();
        }
    }
    
    public static Cursor b(ldn ldn, final k0s k0s, final boolean b) {
        final Cursor o = ldn.o(k0s);
        if (b && o instanceof AbstractWindowedCursor) {
            ldn = (ldn)o;
            final int count = ((AbstractCursor)ldn).getCount();
            int numRows;
            if (((AbstractWindowedCursor)ldn).hasWindow()) {
                numRows = ((AbstractWindowedCursor)ldn).getWindow().getNumRows();
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
                final MatrixCursor matrixCursor = new MatrixCursor(((Cursor)ldn).getColumnNames(), ((Cursor)ldn).getCount());
                while (((Cursor)ldn).moveToNext()) {
                    final Object[] array = new Object[((Cursor)ldn).getColumnCount()];
                    for (int i = 0; i < ((Cursor)ldn).getColumnCount(); ++i) {
                        final int type = ((Cursor)ldn).getType(i);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type != 4) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = ((Cursor)ldn).getBlob(i);
                                    }
                                    else {
                                        array[i] = ((Cursor)ldn).getString(i);
                                    }
                                }
                                else {
                                    array[i] = ((Cursor)ldn).getDouble(i);
                                }
                            }
                            else {
                                array[i] = ((Cursor)ldn).getLong(i);
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
                ((Cursor)ldn).close();
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
