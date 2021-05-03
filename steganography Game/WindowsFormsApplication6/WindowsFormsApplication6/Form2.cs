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
using System.Collections;

namespace WindowsFormsApplication6
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
           
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (!File.Exists("Employees.xml"))
            {
                MessageBox.Show("This File is Clear");
            }
            else { 
            Dgv_Employees.Rows.Clear();
            XmlDocument doc = new XmlDocument();
            doc.Load("Employees.xml");
            XmlNodeList list = doc.GetElementsByTagName("Employee");
            int col = 0;
            for (int i = 0; i < list.Count; i++)
            {
                XmlNodeList childerns = list[i].ChildNodes;
                String id = childerns[0].InnerText;
                String Name = childerns[1].InnerText;
                String Gender = childerns[2].InnerText;
                String Department = childerns[3].InnerText;
                XmlNodeList projectsNode = childerns[4].ChildNodes;
                int c = projectsNode.Count;
                String[] projects = new String[c];

                for (int j = 0; j < projectsNode.Count; j++)
                {
                    projects[j] = projectsNode[j].InnerText;

                }
                var cell = new DataGridViewComboBoxCell();
                cell.DataSource = projects;
                String cg = comboBox1.Text;
                if (Gender == "Male" && cg == "Male")
                {

                    Dgv_Employees.Rows.Add(id, Name, Gender, Department);
                    Dgv_Employees.Rows[col].Cells[4] = cell;
                    col++;
                }
                else if (Gender == "Female" && cg == "Female")
                {

                    Dgv_Employees.Rows.Add(id, Name, Gender, Department);
                    Dgv_Employees.Rows[col].Cells[4] = cell;
                    col++;
                }

            }
            }
        }
    }
}
