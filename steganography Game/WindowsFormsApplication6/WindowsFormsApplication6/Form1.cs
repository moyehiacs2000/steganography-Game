using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Xml;

namespace WindowsFormsApplication6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Form2 F = new Form2();
            F.ShowDialog();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String id = IDtxt.Text;
            String name = nametxt.Text;
            String gender = "";
            if (rfemale.Checked)
            {
                gender = rfemale.Text;
            }
            else if (rmale.Checked)
            {
                gender = rmale.Text;
            }
            String department = Depcomp.Text;
            String[] projects = new String[3];
            int c = 0;
            if (project1.CheckState == CheckState.Checked)
            {
                projects[c] = project1.Text;
                c++;
            }
            if (project2.CheckState == CheckState.Checked)
            {
                projects[c] = project2.Text;
                c++;
            }
            if (project3.CheckState == CheckState.Checked)
            {
                projects[c] = project3.Text;
                c++;
            }
            if (!File.Exists("Employees.xml"))
            {
                XmlWriter Writer = XmlWriter.Create("Employees.xml");
                Writer.WriteStartDocument();
                Writer.WriteStartElement("Tabel");
                Writer.WriteAttributeString("name", "Employee");
                Writer.WriteStartElement("Employee");
                Writer.WriteStartElement("ID");
                Writer.WriteString(id);
                Writer.WriteEndElement();
                Writer.WriteStartElement("Name");
                Writer.WriteString(name);
                Writer.WriteEndElement();
                Writer.WriteStartElement("Gender");
                Writer.WriteString(gender);
                Writer.WriteEndElement();
                Writer.WriteStartElement("Department");
                Writer.WriteString(department);
                Writer.WriteEndElement();
                Writer.WriteStartElement("Projects");
                for (int i = 0; i < c; i++)
                {
                    Writer.WriteStartElement("Item");
                    Writer.WriteString(projects[i]);
                    Writer.WriteEndElement();
                }
                Writer.WriteEndElement();

                Writer.WriteEndElement();
                Writer.WriteEndElement();
                Writer.WriteEndDocument();
                Writer.Close();
               

            }
            else
            {
                XmlDocument doc = new XmlDocument();
                XmlElement product = doc.CreateElement("Employee");
                XmlElement node = doc.CreateElement("ID");
                node.InnerText = id;
                product.AppendChild(node);
                node = doc.CreateElement("Name");
                node.InnerText = name;
                product.AppendChild(node);
                node = doc.CreateElement("Gender");
                node.InnerText = gender;
                product.AppendChild(node);
                node = doc.CreateElement("Department");
                node.InnerText = department;
                product.AppendChild(node);
                node = doc.CreateElement("Projects");
                XmlElement node2;
                for (int i = 0; i < c; i++)
                {
                    node2 = doc.CreateElement("Item");
                    node2.InnerText = projects[i];
                    node.AppendChild(node2);
                }
                product.AppendChild(node);
                doc.Load("Employees.xml");
                XmlElement root = doc.DocumentElement;
                root.AppendChild(product);
                doc.Save("Employees.xml");
            }
            MessageBox.Show("Successfully Added!!");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            File.Delete("Employees.xml");
            MessageBox.Show("Done");
        }
    }
}
