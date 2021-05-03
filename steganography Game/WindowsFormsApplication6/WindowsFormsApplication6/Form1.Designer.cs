namespace WindowsFormsApplication6
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.IDtxt = new System.Windows.Forms.TextBox();
            this.nametxt = new System.Windows.Forms.TextBox();
            this.rmale = new System.Windows.Forms.RadioButton();
            this.rfemale = new System.Windows.Forms.RadioButton();
            this.label4 = new System.Windows.Forms.Label();
            this.Depcomp = new System.Windows.Forms.ComboBox();
            this.label5 = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.project3 = new System.Windows.Forms.CheckBox();
            this.project2 = new System.Windows.Forms.CheckBox();
            this.project1 = new System.Windows.Forms.CheckBox();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(62, 53);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(18, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "ID";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(62, 138);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(42, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Gender";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(62, 92);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(35, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Name";
            // 
            // IDtxt
            // 
            this.IDtxt.Location = new System.Drawing.Point(127, 53);
            this.IDtxt.Name = "IDtxt";
            this.IDtxt.Size = new System.Drawing.Size(117, 20);
            this.IDtxt.TabIndex = 3;
            // 
            // nametxt
            // 
            this.nametxt.Location = new System.Drawing.Point(127, 89);
            this.nametxt.Name = "nametxt";
            this.nametxt.Size = new System.Drawing.Size(117, 20);
            this.nametxt.TabIndex = 5;
            // 
            // rmale
            // 
            this.rmale.AutoSize = true;
            this.rmale.Location = new System.Drawing.Point(196, 138);
            this.rmale.Name = "rmale";
            this.rmale.Size = new System.Drawing.Size(48, 17);
            this.rmale.TabIndex = 6;
            this.rmale.TabStop = true;
            this.rmale.Text = "Male";
            this.rmale.UseVisualStyleBackColor = true;
            // 
            // rfemale
            // 
            this.rfemale.AutoSize = true;
            this.rfemale.Location = new System.Drawing.Point(127, 138);
            this.rfemale.Name = "rfemale";
            this.rfemale.Size = new System.Drawing.Size(59, 17);
            this.rfemale.TabIndex = 7;
            this.rfemale.TabStop = true;
            this.rfemale.Text = "Female";
            this.rfemale.UseVisualStyleBackColor = true;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(62, 178);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(62, 13);
            this.label4.TabIndex = 8;
            this.label4.Text = "Department";
            // 
            // Depcomp
            // 
            this.Depcomp.FormattingEnabled = true;
            this.Depcomp.Items.AddRange(new object[] {
            "IS",
            "CS",
            "IT",
            "SW"});
            this.Depcomp.Location = new System.Drawing.Point(127, 178);
            this.Depcomp.Name = "Depcomp";
            this.Depcomp.Size = new System.Drawing.Size(121, 21);
            this.Depcomp.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(62, 222);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(45, 13);
            this.label5.TabIndex = 10;
            this.label5.Text = "Projects";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.project3);
            this.panel1.Controls.Add(this.project2);
            this.panel1.Controls.Add(this.project1);
            this.panel1.Location = new System.Drawing.Point(127, 222);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(154, 86);
            this.panel1.TabIndex = 11;
            // 
            // project3
            // 
            this.project3.AutoSize = true;
            this.project3.Location = new System.Drawing.Point(3, 55);
            this.project3.Name = "project3";
            this.project3.Size = new System.Drawing.Size(65, 17);
            this.project3.TabIndex = 2;
            this.project3.Text = "Project3";
            this.project3.UseVisualStyleBackColor = true;
            // 
            // project2
            // 
            this.project2.AutoSize = true;
            this.project2.Location = new System.Drawing.Point(3, 26);
            this.project2.Name = "project2";
            this.project2.Size = new System.Drawing.Size(65, 17);
            this.project2.TabIndex = 1;
            this.project2.Text = "Project2";
            this.project2.UseVisualStyleBackColor = true;
            // 
            // project1
            // 
            this.project1.AutoSize = true;
            this.project1.Location = new System.Drawing.Point(3, 3);
            this.project1.Name = "project1";
            this.project1.Size = new System.Drawing.Size(65, 17);
            this.project1.TabIndex = 0;
            this.project1.Text = "Project1";
            this.project1.UseVisualStyleBackColor = true;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(85, 348);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(125, 23);
            this.button1.TabIndex = 12;
            this.button1.Text = "Add Employee";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(85, 392);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(125, 23);
            this.button2.TabIndex = 13;
            this.button2.Text = "Clear File";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(244, 348);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(86, 67);
            this.button3.TabIndex = 14;
            this.button3.Text = "Search\r\nEmployees\r\n";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(438, 449);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.Depcomp);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.rfemale);
            this.Controls.Add(this.rmale);
            this.Controls.Add(this.nametxt);
            this.Controls.Add(this.IDtxt);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox IDtxt;
        private System.Windows.Forms.TextBox nametxt;
        private System.Windows.Forms.RadioButton rmale;
        private System.Windows.Forms.RadioButton rfemale;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.ComboBox Depcomp;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.CheckBox project3;
        private System.Windows.Forms.CheckBox project2;
        private System.Windows.Forms.CheckBox project1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
    }
}

