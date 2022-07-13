import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Notepad extends JFrame implements ActionListener {

  JMenuBar mb1;
  JMenu mFile,mEdit,mTools,mHelp;
  JMenuItem mNew,mOpen,mSave,mPrint,mExit;
  JMenuItem mCut,mCopy,mPaste,mSelectAll;
  JMenuItem mView,mCompile,mRun;
  JMenuItem mAbout;
  JEditorPane jed;
  JFileChooser jfc;
  
  public Notepad()
  {
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,500);
    mb1 = new JMenuBar();
    mFile = new JMenu("File");
    mEdit  = new JMenu("Edit");
    mTools = new JMenu("Tools");
    mHelp = new JMenu("Help");
    
    mNew = new JMenuItem("New");
    mOpen = new JMenuItem("Open");
    mSave= new JMenuItem("Save");
    mPrint = new JMenuItem("Print");
    mExit = new JMenuItem("Exit");
    
    mCut = new JMenuItem("Cut");
    mCopy = new JMenuItem("Copy");
    mPaste = new JMenuItem("Paste");
    mSelectAll = new JMenuItem("Select All");
    
    mView = new JMenuItem("View in Browser");
    mCompile = new JMenuItem("Compile");
    mRun = new JMenuItem("Run");
    
    mAbout = new JMenuItem("About");
    JSeparator js1 = new JSeparator();
    JSeparator js2 = new JSeparator();
    
    mFile.add(mNew);mFile.add(mOpen);
    mFile.add(mSave);mFile.add(mPrint);
    mFile.add(js1);
    mFile.add(mExit);
    
    mEdit.add(mCut);mEdit.add(mCopy);
    mEdit.add(mPaste);
    mEdit.add(js2);
    mEdit.add(mSelectAll);
    
    mTools.add(mView);mTools.add(mCompile);
    mTools.add(mRun);
    
    mHelp.add(mAbout);
    
    mb1.add(mFile);mb1.add(mEdit);mb1.add(mTools);
    mb1.add(mHelp);
    
    this.setJMenuBar(mb1);
    
    
    jed = new JEditorPane();
    JScrollPane js = new JScrollPane(jed);
    this.add(js);
    Font f = new Font("Arial", Font.BOLD, 18);
    jfc = new JFileChooser();
    jed.setFont(f);
    
    //jed.setBackground(Color.black);
    //jed.setForeground(Color.white);
    
    mNew.addActionListener(this);
    mOpen.addActionListener(this);
    mSave.addActionListener(this);
    mPrint.addActionListener(this);
    mExit.addActionListener(this);
    
    mCut.addActionListener(this);
    mCopy.addActionListener(this);
    mPaste.addActionListener(this);
    mSelectAll.addActionListener(this);
    
    mView.addActionListener(this);
    mCompile.addActionListener(this);
    mRun.addActionListener(this);
    
    mAbout.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==mNew)
    {
      
    }
    if(e.getSource()==mOpen)
    {
      jfc.showOpenDialog(null);
      try
      {
        File f = jfc.getSelectedFile();
        //f.delete();
        FileInputStream fin = new FileInputStream(f);
        byte data[] = new byte[fin.available()];
        fin.read(data);
        jed.setText(new String(data));
        fin.close();
        setTitle(f.getAbsolutePath());
        
      }
      catch(Exception ex)
      {
        
      }
    }
    if(e.getSource()==mSave)
    {
      jfc.showSaveDialog(this);
      try {
        File f = jfc.getSelectedFile();
        FileOutputStream fout = new FileOutputStream(f);
        fout.write(jed.getText().getBytes());
        fout.flush();
        fout.close();
        setTitle(f.getAbsolutePath());
        
      }
      catch(Exception ex)
      {
        
      }
      
      
      
      
    }
    if(e.getSource()==mPrint)
    {
      try {
        jed.print();
      }
      catch(Exception ex) {
        
      }
      
    }
    if(e.getSource()==mExit)
    {
      JOptionPane.showMessageDialog(null,"Bye Bye");
      System.exit(0);
    }
    
    if(e.getSource()==mCut)
    {
      jed.cut();
    }
    if(e.getSource()==mCopy)
    {
      jed.copy();
    }
    if(e.getSource()==mPaste)
    {
      jed.paste();
    }
    if(e.getSource()==mSelectAll)
    {
      jed.selectAll();
    }
    if(e.getSource()==mView)
    {
      
    }
    if(e.getSource()==mCompile)
    {
      
    }
    if(e.getSource()==mRun)
    {
      
    }
    
    if(e.getSource()==mAbout)