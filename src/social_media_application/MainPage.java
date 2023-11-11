package social_media_application;

import java.awt.Image;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainPage extends javax.swing.JFrame {
    
    String path = null;
    File f = null;
    String path1 = null;
    File f1 = null;
    public int id;
    public ArrayList<Integer> suggested = new ArrayList<Integer>();    
    public ArrayList<Integer> followers = new ArrayList<Integer>();
    public ArrayList<Integer> followings = new ArrayList<Integer>();
    public ArrayList<Integer> myPosts = new ArrayList<Integer>();
    public ArrayList<Integer> friendPosts = new ArrayList<Integer>();
    public int s, fr, fg, mp, fp;

    public MainPage(int ID) {
        initComponents();
        id = ID;
        getMyPosts(id);
        if(!myPosts.isEmpty())
            showMyPosts(myPosts.get(0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        yourPostPanel = new javax.swing.JPanel();
        viewPost = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        postText = new javax.swing.JTextArea();
        postNext = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        postComments = new javax.swing.JTextArea();
        commentsLabel = new javax.swing.JLabel();
        postPic = new javax.swing.JLabel();
        deletePost = new javax.swing.JButton();
        freindsPostsPanel = new javax.swing.JPanel();
        friendsPostPic = new javax.swing.JLabel();
        freindsPostNext = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        friendsPostText = new javax.swing.JTextArea();
        postOwner = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        friendsPostComments = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        friendsPostWriteComment = new javax.swing.JTextArea();
        frindsPostCommentDone = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        writePostPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        writePost = new javax.swing.JTextArea();
        btnPost = new javax.swing.JButton();
        writePostPic = new javax.swing.JLabel();
        btnChoosePostPic = new javax.swing.JButton();
        suggestedPanel = new javax.swing.JPanel();
        suggestedProfileImg = new javax.swing.JLabel();
        suggestedFollowBtn = new javax.swing.JButton();
        suggestedPrev = new javax.swing.JButton();
        suggestedNext = new javax.swing.JButton();
        suggestedUsername = new javax.swing.JLabel();
        followersPanel = new javax.swing.JPanel();
        followersUsername = new javax.swing.JLabel();
        followersProfileImg = new javax.swing.JLabel();
        followersPrev = new javax.swing.JButton();
        followersNext = new javax.swing.JButton();
        followerRemoveBtn = new javax.swing.JButton();
        followingPanel = new javax.swing.JPanel();
        followingUsername = new javax.swing.JLabel();
        followingProfileImg = new javax.swing.JLabel();
        followingRemoveBtn = new javax.swing.JButton();
        followingPrev = new javax.swing.JButton();
        followingNext = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        profileUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        profileName = new javax.swing.JTextField();
        profileEmail = new javax.swing.JTextField();
        profilePassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        profileDate = new javax.swing.JTextField();
        profileMonth = new javax.swing.JTextField();
        profileYear = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        profileImg = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        viewPost.setBackground(new java.awt.Color(255, 255, 255));

        postText.setEditable(false);
        postText.setBackground(new java.awt.Color(255, 255, 255));
        postText.setColumns(20);
        postText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        postText.setLineWrap(true);
        postText.setRows(5);
        postText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(postText);

        postNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/next.png"))); // NOI18N
        postNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postNextActionPerformed(evt);
            }
        });

        postComments.setEditable(false);
        postComments.setBackground(new java.awt.Color(255, 255, 255));
        postComments.setColumns(20);
        postComments.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        postComments.setLineWrap(true);
        postComments.setRows(5);
        postComments.setWrapStyleWord(true);
        jScrollPane2.setViewportView(postComments);

        commentsLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        commentsLabel.setText("COMMENTS");

        postPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        deletePost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/trashCan.png"))); // NOI18N
        deletePost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewPostLayout = new javax.swing.GroupLayout(viewPost);
        viewPost.setLayout(viewPostLayout);
        viewPostLayout.setHorizontalGroup(
            viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPostLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewPostLayout.createSequentialGroup()
                        .addComponent(postPic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postNext, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(deletePost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(commentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        viewPostLayout.setVerticalGroup(
            viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPostLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(viewPostLayout.createSequentialGroup()
                        .addGroup(viewPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(postPic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(viewPostLayout.createSequentialGroup()
                                .addComponent(deletePost, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(postNext, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewPostLayout.createSequentialGroup()
                        .addComponent(commentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout yourPostPanelLayout = new javax.swing.GroupLayout(yourPostPanel);
        yourPostPanel.setLayout(yourPostPanelLayout);
        yourPostPanelLayout.setHorizontalGroup(
            yourPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        yourPostPanelLayout.setVerticalGroup(
            yourPostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Your Posts", yourPostPanel);

        freindsPostsPanel.setBackground(new java.awt.Color(255, 255, 255));

        friendsPostPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        freindsPostNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/next.png"))); // NOI18N
        freindsPostNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freindsPostNextActionPerformed(evt);
            }
        });

        friendsPostText.setEditable(false);
        friendsPostText.setBackground(new java.awt.Color(255, 255, 255));
        friendsPostText.setColumns(20);
        friendsPostText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        friendsPostText.setLineWrap(true);
        friendsPostText.setRows(5);
        friendsPostText.setWrapStyleWord(true);
        jScrollPane5.setViewportView(friendsPostText);

        postOwner.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        postOwner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        friendsPostComments.setEditable(false);
        friendsPostComments.setBackground(new java.awt.Color(255, 255, 255));
        friendsPostComments.setColumns(20);
        friendsPostComments.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        friendsPostComments.setLineWrap(true);
        friendsPostComments.setRows(5);
        friendsPostComments.setWrapStyleWord(true);
        friendsPostComments.setBorder(null);
        jScrollPane3.setViewportView(friendsPostComments);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("View", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        friendsPostWriteComment.setColumns(20);
        friendsPostWriteComment.setLineWrap(true);
        friendsPostWriteComment.setRows(5);
        friendsPostWriteComment.setWrapStyleWord(true);
        friendsPostWriteComment.setBorder(null);
        jScrollPane6.setViewportView(friendsPostWriteComment);

        frindsPostCommentDone.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        frindsPostCommentDone.setText("DONE");
        frindsPostCommentDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frindsPostCommentDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(frindsPostCommentDone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frindsPostCommentDone)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Write", jPanel3);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("COMMENTS");

        javax.swing.GroupLayout freindsPostsPanelLayout = new javax.swing.GroupLayout(freindsPostsPanel);
        freindsPostsPanel.setLayout(freindsPostsPanelLayout);
        freindsPostsPanelLayout.setHorizontalGroup(
            freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(freindsPostsPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(freindsPostsPanelLayout.createSequentialGroup()
                        .addGroup(freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(friendsPostPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(freindsPostNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        freindsPostsPanelLayout.setVerticalGroup(
            freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freindsPostsPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(freindsPostsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(freindsPostsPanelLayout.createSequentialGroup()
                        .addGroup(freindsPostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(freindsPostNext, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(freindsPostsPanelLayout.createSequentialGroup()
                                .addComponent(postOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(friendsPostPic, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Friends Posts", freindsPostsPanel);

        writePostPanel.setBackground(new java.awt.Color(255, 255, 255));

        writePost.setColumns(20);
        writePost.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        writePost.setLineWrap(true);
        writePost.setRows(5);
        writePost.setWrapStyleWord(true);
        jScrollPane4.setViewportView(writePost);

        btnPost.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPost.setText("POST");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        writePostPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnChoosePostPic.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnChoosePostPic.setText("CHOOSE");
        btnChoosePostPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoosePostPicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout writePostPanelLayout = new javax.swing.GroupLayout(writePostPanel);
        writePostPanel.setLayout(writePostPanelLayout);
        writePostPanelLayout.setHorizontalGroup(
            writePostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writePostPanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(writePostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPost)
                    .addGroup(writePostPanelLayout.createSequentialGroup()
                        .addGroup(writePostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(writePostPic, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(btnChoosePostPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        writePostPanelLayout.setVerticalGroup(
            writePostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writePostPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(writePostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(writePostPanelLayout.createSequentialGroup()
                        .addComponent(writePostPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChoosePostPic))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPost)
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Write Post", writePostPanel);

        suggestedPanel.setBackground(new java.awt.Color(255, 255, 255));

        suggestedProfileImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        suggestedFollowBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        suggestedFollowBtn.setText("FOLLOW");
        suggestedFollowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestedFollowBtnActionPerformed(evt);
            }
        });

        suggestedPrev.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        suggestedPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/prev.png"))); // NOI18N
        suggestedPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestedPrevActionPerformed(evt);
            }
        });

        suggestedNext.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        suggestedNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/next.png"))); // NOI18N
        suggestedNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestedNextActionPerformed(evt);
            }
        });

        suggestedUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        suggestedUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suggestedUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        javax.swing.GroupLayout suggestedPanelLayout = new javax.swing.GroupLayout(suggestedPanel);
        suggestedPanel.setLayout(suggestedPanelLayout);
        suggestedPanelLayout.setHorizontalGroup(
            suggestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suggestedPanelLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(suggestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suggestedPanelLayout.createSequentialGroup()
                        .addComponent(suggestedFollowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suggestedPanelLayout.createSequentialGroup()
                        .addComponent(suggestedPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(suggestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(suggestedUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suggestedProfileImg, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(suggestedNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        suggestedPanelLayout.setVerticalGroup(
            suggestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suggestedPanelLayout.createSequentialGroup()
                .addGroup(suggestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(suggestedPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(suggestedProfileImg, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(suggestedPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(suggestedPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(suggestedPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(suggestedNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suggestedUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(suggestedFollowBtn)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Suggested", suggestedPanel);

        followersPanel.setBackground(new java.awt.Color(255, 255, 255));

        followersUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        followersUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        followersUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        followersProfileImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        followersPrev.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        followersPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/prev.png"))); // NOI18N
        followersPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followersPrevActionPerformed(evt);
            }
        });

        followersNext.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        followersNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/next.png"))); // NOI18N
        followersNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followersNextActionPerformed(evt);
            }
        });

        followerRemoveBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        followerRemoveBtn.setText("REMOVE");
        followerRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followerRemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout followersPanelLayout = new javax.swing.GroupLayout(followersPanel);
        followersPanel.setLayout(followersPanelLayout);
        followersPanelLayout.setHorizontalGroup(
            followersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(followersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, followersPanelLayout.createSequentialGroup()
                        .addComponent(followersPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(followersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(followersUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(followersProfileImg, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(followersNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, followersPanelLayout.createSequentialGroup()
                        .addComponent(followerRemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))))
        );
        followersPanelLayout.setVerticalGroup(
            followersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followersPanelLayout.createSequentialGroup()
                .addGroup(followersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(followersPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(followersProfileImg, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(followersPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(followersPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(followersPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(followersNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followersUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(followerRemoveBtn)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Followers", followersPanel);

        followingPanel.setBackground(new java.awt.Color(255, 255, 255));

        followingUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        followingUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        followingUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        followingProfileImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        followingRemoveBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        followingRemoveBtn.setText("UNFOLLOW");
        followingRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followingRemoveBtnActionPerformed(evt);
            }
        });

        followingPrev.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        followingPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/prev.png"))); // NOI18N
        followingPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followingPrevActionPerformed(evt);
            }
        });

        followingNext.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        followingNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/next.png"))); // NOI18N
        followingNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followingNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout followingPanelLayout = new javax.swing.GroupLayout(followingPanel);
        followingPanel.setLayout(followingPanelLayout);
        followingPanelLayout.setHorizontalGroup(
            followingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followingPanelLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(followingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, followingPanelLayout.createSequentialGroup()
                        .addComponent(followingRemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, followingPanelLayout.createSequentialGroup()
                        .addComponent(followingPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(followingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(followingUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(followingProfileImg, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(followingNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        followingPanelLayout.setVerticalGroup(
            followingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followingPanelLayout.createSequentialGroup()
                .addGroup(followingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(followingPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(followingProfileImg, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(followingPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(followingPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(followingPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(followingNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followingUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(followingRemoveBtn)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Followings", followingPanel);

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");

        profileUsername.setEditable(false);
        profileUsername.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date of Birth");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password");

        profileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileNameActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email");

        profileDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        profileMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        profileYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(61, 61, 61)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(profileName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profileEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(profileDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profileYear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(profileDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profilePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addComponent(btnSave)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setText("Your Profile");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(17, 17, 17))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        profileImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        btnChoose.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnChoose.setText("CHOOSE");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(profileImg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnChoose)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileImg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChoose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Profile", profilePanel);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");

        signOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/signout.png"))); // NOI18N
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social_media_application/deleteUser.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileNameActionPerformed

    private void showUser(int id){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                profileUsername.setText(rs.getString("username"));
                profileName.setText(rs.getString("name"));
                profileEmail.setText(rs.getString("email"));
                profilePassword.setText(rs.getString("password"));
                if(rs.getDate("dob") != null){
                    Date dob = rs.getDate("dob");
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    String dobStr = formatter.format(dob);
                    String[] dobParts = dobStr.split("-");
                    String day = dobParts[0];
                    String month = dobParts[1];
                    String year = dobParts[2];
                    profileDate.setText(day);
                    profileMonth.setText(month);
                    profileYear.setText(year);
                }
                if(rs.getBytes("profilePic") != null){
                    ImageIcon icon = new ImageIcon(new ImageIcon(rs.getBytes("profilePic")).getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH));
                    profileImg.setIcon(icon);
                }
                else{
                    ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("/social_media_application/profile.png")).getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH));
                    profileImg.setIcon(icon);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET name = ?, email = ?, dob = STR_TO_DATE(?, '%d-%m-%Y'), password = ? WHERE username = ?");
            ps.setString(1, profileName.getText().trim());
            ps.setString(2, profileEmail.getText().trim());
            ps.setString(3, profileDate.getText().trim()+"-"+profileMonth.getText().trim()+"-"+profileYear.getText().trim());
            ps.setString(4, profilePassword.getText().trim());
            ps.setString(5, profileUsername.getText().trim());
            int i = ps.executeUpdate();
            if (i > 0){
                JOptionPane.showMessageDialog(null, "Saved successfully");
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG JPEG","png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);
        if (load == fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH));
            profileImg.setIcon(icon);
        }
        File f = new File(path);
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            InputStream is = new FileInputStream(f);
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET profilePic = ? WHERE username = ?");
            ps.setBlob(1, is);
            ps.setString(2, profileUsername.getText().trim());
            int i = ps.executeUpdate();
            if (i > 0){
                JOptionPane.showMessageDialog(null, "Profile picture changed successfully");
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        this.dispose();
        new Login().show();
    }//GEN-LAST:event_signOutActionPerformed

    private void getSuggestions(int id){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id != ? AND id NOT IN ( SELECT followedUserid FROM relationships WHERE followerUserid = ? )");
            ps.setInt(1, id);            
            ps.setInt(2, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(!suggested.contains(rs.getInt("id")))
                    suggested.add(rs.getInt("id"));
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getFollowers(int id){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT u.* FROM users u JOIN relationships r ON u.id = r.followerUserid WHERE r.followedUserid = ?");
            ps.setInt(1, id);    
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(!followers.contains(rs.getInt("id")))
                    followers.add(rs.getInt("id"));
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getFollowings(int id){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT u.* FROM users u JOIN relationships r ON u.id = r.followedUserid WHERE r.followerUserid = ?");
            ps.setInt(1, id); 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(!followings.contains(rs.getInt("id")))
                    followings.add(rs.getInt("id"));
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getMyPosts(int id){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM posts WHERE userid = ?");
            ps.setInt(1, id); 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(!myPosts.contains(rs.getInt("id")))
                    myPosts.add(rs.getInt("id"));
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getFriendPost(int id){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            for(int userid : followings){
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM posts WHERE userid = ?");
                ps.setInt(1, userid); 
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    if(!friendPosts.contains(rs.getInt("id")))
                        friendPosts.add(rs.getInt("id"));
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void showSuggested(int id){
        if(id == -1){
            suggestedProfileImg.setIcon(null);
            suggestedUsername.setText("");
        }
        else{
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
                ps.setInt(1, id);  
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    if(rs.getBytes("profilePic") != null){
                        ImageIcon icon = new ImageIcon(new ImageIcon(rs.getBytes("profilePic")).getImage().getScaledInstance(228, 208, Image.SCALE_SMOOTH));
                        suggestedProfileImg.setIcon(icon);
                    }
                    else{
                        ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("/social_media_application/profile.png")).getImage().getScaledInstance(228, 208, Image.SCALE_SMOOTH));
                        suggestedProfileImg.setIcon(icon);
                    }
                    suggestedUsername.setText(rs.getString("username"));
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
    
    private void showFollower(int id){
        if(id == -1){
            followersProfileImg.setIcon(null);
            followersUsername.setText("");
        }
        else{
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
                ps.setInt(1, id);  
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    if(rs.getBytes("profilePic") != null){
                        ImageIcon icon = new ImageIcon(new ImageIcon(rs.getBytes("profilePic")).getImage().getScaledInstance(228, 208, Image.SCALE_SMOOTH));
                        followersProfileImg.setIcon(icon);
                    }
                    else{
                        ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("/social_media_application/profile.png")).getImage().getScaledInstance(228, 208, Image.SCALE_SMOOTH));
                        followersProfileImg.setIcon(icon);
                    }
                    followersUsername.setText(rs.getString("username"));
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
    private void showFollowing(int id){
        if(id == -1){
            followingProfileImg.setIcon(null);
            followingUsername.setText("");
        }
        else{
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
                ps.setInt(1, id);  
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    if(rs.getBytes("profilePic") != null){
                        ImageIcon icon = new ImageIcon(new ImageIcon(rs.getBytes("profilePic")).getImage().getScaledInstance(228, 208, Image.SCALE_SMOOTH));
                        followingProfileImg.setIcon(icon);
                    }
                    else{
                        ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("/social_media_application/profile.png")).getImage().getScaledInstance(228, 208, Image.SCALE_SMOOTH));
                        followingProfileImg.setIcon(icon);
                    }
                    followingUsername.setText(rs.getString("username"));
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void showMyPosts(int id){
        if(id == -1){
            postPic.setIcon(null);
            postText.setText("");
        }
        else{
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM posts WHERE id = ?");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    if(rs.getBytes("img") != null){
                        ImageIcon icon = new ImageIcon(new ImageIcon(rs.getBytes("img")).getImage().getScaledInstance(280, 280, Image.SCALE_SMOOTH));
                        postPic.setIcon(icon);
                        postText.setText(rs.getString("createdAt")+"\n"+rs.getString("desc"));
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            showMyComments();
        }
    }
    
    private void showFriendPost(int id){
        if(id == -1){
            friendsPostPic.setIcon(null);
            friendsPostText.setText("");
            postOwner.setText("");
        }
        else{
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("SELECT posts.*, users.username FROM posts JOIN users ON posts.userid = users.id WHERE posts.id = ?;");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    if(rs.getBytes("img") != null){
                        ImageIcon icon = new ImageIcon(new ImageIcon(rs.getBytes("img")).getImage().getScaledInstance(280, 255, Image.SCALE_SMOOTH));
                        friendsPostPic.setIcon(icon);
                        friendsPostText.setText(rs.getString("createdAt")+"\n"+rs.getString("desc"));
                        postOwner.setText(rs.getString("username"));
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            showFriendsComments();
        }
    }
    
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        suggested.clear();
        followers.clear();
        followings.clear();
        myPosts.clear();
        friendPosts.clear();
        showUser(id);
        getSuggestions(id);
        getFollowings(id);
        getFollowers(id);
        getMyPosts(id);
        getFriendPost(id);
        s = fr = fg = mp = fp = 0;
        if(!suggested.isEmpty())
            showSuggested(suggested.get(s));
        else
            showSuggested(-1);
        if(!followers.isEmpty())
            showFollower(followers.get(fr));
        else
            showFollower(-1);
        if(!followings.isEmpty())
            showFollowing(followings.get(fg));
        else
            showFollowing(-1);
        if(!myPosts.isEmpty())
            showMyPosts(myPosts.get(mp));
        else
            showMyPosts(-1);
        if(!friendPosts.isEmpty())
            showFriendPost(friendPosts.get(fp));
        else
            showFriendPost(-1);
//        showFriendsComments();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void suggestedNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestedNextActionPerformed
        s = (s + 1) % suggested.size();
        showSuggested(suggested.get(s));
    }//GEN-LAST:event_suggestedNextActionPerformed

    private void suggestedPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestedPrevActionPerformed
        s = (s + suggested.size() - 1) % suggested.size();
        showSuggested(suggested.get(s));
    }//GEN-LAST:event_suggestedPrevActionPerformed

    private void followersNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followersNextActionPerformed
        if(!followers.isEmpty()){
            fr = (fr + 1) % followers.size();
            showFollower(followers.get(fr));
        }
    }//GEN-LAST:event_followersNextActionPerformed

    private void followersPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followersPrevActionPerformed
        if(!followers.isEmpty()){
            fr = (fr + followers.size() - 1) % followers.size();
            showFollower(followers.get(fr));
        }
    }//GEN-LAST:event_followersPrevActionPerformed

    private void suggestedFollowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestedFollowBtnActionPerformed
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO relationships(followerUserid, followedUserid) VALUES(?, (SELECT id FROM users WHERE username = ?))");
            ps.setInt(1, id);
            ps.setString(2, suggestedUsername.getText());
            int i = ps.executeUpdate();
            if (i > 0){
                JOptionPane.showMessageDialog(null, "You are now following " + suggestedUsername.getText());
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_suggestedFollowBtnActionPerformed

    private void followingNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followingNextActionPerformed
        if(!followings.isEmpty()){
            fg = (fg + 1) % followings.size();
            showFollowing(followings.get(fg));
        }
    }//GEN-LAST:event_followingNextActionPerformed

    private void followingPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followingPrevActionPerformed
        if(!followings.isEmpty()){
            fg = (fg + followings.size() - 1) % followings.size();
            showFollowing(followings.get(fg));
        }
    }//GEN-LAST:event_followingPrevActionPerformed

    private void followingRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followingRemoveBtnActionPerformed
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM relationships WHERE followerUserid = ? AND followedUserid = (SELECT id FROM users WHERE username = ?)");
            ps.setInt(1, id);
            ps.setString(2, followingUsername.getText());
            int i = ps.executeUpdate();
            if (i > 0){
                JOptionPane.showMessageDialog(null, "You have unfollowed " + followingUsername.getText());
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_followingRemoveBtnActionPerformed

    private void followerRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followerRemoveBtnActionPerformed
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM relationships WHERE followerUserid = (SELECT id FROM users WHERE username = ?) AND followedUserid = ?");
            ps.setString(1, followersUsername.getText());
            ps.setInt(2, id);
            int i = ps.executeUpdate();
            if (i > 0){
                JOptionPane.showMessageDialog(null, "You have removed " + followersUsername.getText());
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_followerRemoveBtnActionPerformed

    private void btnChoosePostPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoosePostPicActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG JPEG","png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);
        if (load == fileChooser.APPROVE_OPTION){
            f1 = fileChooser.getSelectedFile();
            path1 = f1.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(path1).getImage().getScaledInstance(280, 280, Image.SCALE_SMOOTH));
            writePostPic.setIcon(icon);
        }
    }//GEN-LAST:event_btnChoosePostPicActionPerformed

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        File f1 = new File(path1);
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            InputStream is1 = new FileInputStream(f1);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO posts(`desc`, img, userid, createdAt) VALUES (?, ?, ?, (NOW()))");
            ps.setString(1, writePost.getText().trim());
            ps.setBlob(2, is1);
            ps.setInt(3, id);
            int i = ps.executeUpdate();
            if (i > 0){
                JOptionPane.showMessageDialog(null, "Posted");
                writePost.setText("");
                writePostPic.setIcon(null);
            }
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPostActionPerformed

    private void postNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postNextActionPerformed
        if(!myPosts.isEmpty()){
            mp = (mp + 1) % myPosts.size();
            showMyPosts(myPosts.get(mp));
        }
    }//GEN-LAST:event_postNextActionPerformed

    private void deletePostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePostActionPerformed
        if(!myPosts.isEmpty()){
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("DELETE FROM posts WHERE id = ?");
                ps.setInt(1, myPosts.get(mp));
                int i = ps.executeUpdate();
                if (i > 0){
                    JOptionPane.showMessageDialog(null, "Post Deleted");
                    mp = (mp + 1) % myPosts.size();
                    showMyPosts(myPosts.get(mp));
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deletePostActionPerformed

    private void freindsPostNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freindsPostNextActionPerformed
        if(!friendPosts.isEmpty()){
            fp = (fp + 1) % friendPosts.size();
            showFriendPost(friendPosts.get(fp));
        }
    }//GEN-LAST:event_freindsPostNextActionPerformed

    private void frindsPostCommentDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frindsPostCommentDoneActionPerformed
        if(!friendPosts.isEmpty()){
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("INSERT INTO comments(`desc`, createdAt, userid, postid) VALUES(?, (NOW()), ?, ?)");
                ps.setString(1, friendsPostWriteComment.getText().trim());
                ps.setInt(2, id);
                ps.setInt(3, friendPosts.get(fp));
                int i = ps.executeUpdate();
                if (i > 0){
                    JOptionPane.showMessageDialog(null, "Done");
                    friendsPostWriteComment.setText("");
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_frindsPostCommentDoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Do you want to delete your account?", "", JOptionPane.YES_NO_OPTION) == 0){
            Connect connection = new Connect();
            try (Connection conn = connection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE id = ?");
                ps.setInt(1, id);
                int i = ps.executeUpdate();
                if (i > 0){
                    JOptionPane.showMessageDialog(null, "Account deleted");
                }
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            new Login().show();            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showFriendsComments(){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT comments.*, users.username FROM comments JOIN users ON comments.userid = users.id WHERE comments.postid = ?;");
            ps.setInt(1, friendPosts.get(fp));
            ResultSet rs = ps.executeQuery();
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                String username = rs.getString("username");
                String comment = rs.getString("desc");
                String date = rs.getString("createdAt");
                sb.append(username).append("\n").append(comment).append("\n").append(date).append("\n\n");
            }
            if (sb.length() > 0)
                friendsPostComments.setText(sb.toString());
            else
                friendsPostComments.setText("");
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void showMyComments(){
        Connect connection = new Connect();
        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT comments.*, users.username FROM comments JOIN users ON comments.userid = users.id WHERE comments.postid = ?;");
            ps.setInt(1, myPosts.get(mp));
            ResultSet rs = ps.executeQuery();
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                String username = rs.getString("username");
                String comment = rs.getString("desc");
                String date = rs.getString("createdAt");
                sb.append(username).append("\n").append(comment).append("\n").append(date).append("\n\n");
            }
            if (sb.length() > 0)
                postComments.setText(sb.toString());
            else
                postComments.setText("");
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            // new MainPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnChoosePostPic;
    private javax.swing.JButton btnPost;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JButton deletePost;
    private javax.swing.JButton followerRemoveBtn;
    private javax.swing.JButton followersNext;
    private javax.swing.JPanel followersPanel;
    private javax.swing.JButton followersPrev;
    private javax.swing.JLabel followersProfileImg;
    private javax.swing.JLabel followersUsername;
    private javax.swing.JButton followingNext;
    private javax.swing.JPanel followingPanel;
    private javax.swing.JButton followingPrev;
    private javax.swing.JLabel followingProfileImg;
    private javax.swing.JButton followingRemoveBtn;
    private javax.swing.JLabel followingUsername;
    private javax.swing.JButton freindsPostNext;
    private javax.swing.JPanel freindsPostsPanel;
    private javax.swing.JTextArea friendsPostComments;
    private javax.swing.JLabel friendsPostPic;
    private javax.swing.JTextArea friendsPostText;
    private javax.swing.JTextArea friendsPostWriteComment;
    private javax.swing.JButton frindsPostCommentDone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea postComments;
    private javax.swing.JButton postNext;
    private javax.swing.JLabel postOwner;
    private javax.swing.JLabel postPic;
    private javax.swing.JTextArea postText;
    private javax.swing.JTextField profileDate;
    private javax.swing.JTextField profileEmail;
    private javax.swing.JLabel profileImg;
    private javax.swing.JTextField profileMonth;
    private javax.swing.JTextField profileName;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPasswordField profilePassword;
    private javax.swing.JTextField profileUsername;
    private javax.swing.JTextField profileYear;
    private javax.swing.JButton signOut;
    private javax.swing.JButton suggestedFollowBtn;
    private javax.swing.JButton suggestedNext;
    private javax.swing.JPanel suggestedPanel;
    private javax.swing.JButton suggestedPrev;
    private javax.swing.JLabel suggestedProfileImg;
    private javax.swing.JLabel suggestedUsername;
    private javax.swing.JPanel viewPost;
    private javax.swing.JTextArea writePost;
    private javax.swing.JPanel writePostPanel;
    private javax.swing.JLabel writePostPic;
    private javax.swing.JPanel yourPostPanel;
    // End of variables declaration//GEN-END:variables
}
